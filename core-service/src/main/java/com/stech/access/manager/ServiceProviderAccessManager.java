package com.stech.access.manager;

import static com.stech.enums.Action.SERVICE_PROVIDER_DELETE;
import static com.stech.enums.Action.SERVICE_PROVIDER_SAVE;
import static com.stech.enums.Action.SERVICE_PROVIDER_UPDATE;
import static com.stech.enums.Action.SERVICE_PROVIDER_VIEW;
import static com.stech.enums.Role.SYS_SERVICE_PROVIDER;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.stech.enums.Action;
import com.stech.enums.Role;
import com.stech.security.ActiveUserContext;
import com.stech.utils.CollectionUtils;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ServiceProviderAccessManager {

	private static Map<Action, Set<Role>> ACTION_ROLES_MAP = new HashMap<>();

	private final ActiveUserContext activeUserContext;

	@PostConstruct
	public void init() {

		ACTION_ROLES_MAP.put(SERVICE_PROVIDER_VIEW, new HashSet<>(Arrays.asList(SYS_SERVICE_PROVIDER)));
		ACTION_ROLES_MAP.put(SERVICE_PROVIDER_SAVE, new HashSet<>(Arrays.asList(SYS_SERVICE_PROVIDER)));
		ACTION_ROLES_MAP.put(SERVICE_PROVIDER_UPDATE, new HashSet<>(Arrays.asList(SYS_SERVICE_PROVIDER)));
		ACTION_ROLES_MAP.put(SERVICE_PROVIDER_DELETE, new HashSet<>(Arrays.asList(SYS_SERVICE_PROVIDER)));
	}

	public void hasAccess(Action action) {

		Set<Role> requiredRoles = Optional.ofNullable(ACTION_ROLES_MAP.get(action))
				.orElseThrow(IllegalArgumentException::new);

		if (!CollectionUtils.containsAny(requiredRoles, activeUserContext.getCurrentUserRoles())) {
			throw new SecurityException();
		}
	}

	public void checkActionAccess(Action action) {

		Set<Role> requiredRoles = Optional.ofNullable(ACTION_ROLES_MAP.get(action))
				.orElseThrow(IllegalArgumentException::new);

		if (!CollectionUtils.containsAny(requiredRoles, activeUserContext.getCurrentUserRoles())) {
			throw new SecurityException();
		}
	}
}
