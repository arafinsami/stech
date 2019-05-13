package com.stech.enums;

import static com.stech.enums.RoleCategory.SYSTEM;
import static com.stech.enums.RoleCategory.SERVICE_SEEKER;
import static com.stech.enums.RoleCategory.SERVICE_PROVIDER;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;


public enum Role {

    SYS_ROOT("Root", SYSTEM, false),
    SYS_SERVICE_SEEKER("Service Seeker", SERVICE_SEEKER, true),
	SYS_SERVICE_PROVIDER("Service Provider",SERVICE_PROVIDER,true);

    private static Map<Role, Set<Role>> assignableRoleMap = new HashMap<>();

    static {
        Set<Role> assinableForEmpRoles = Arrays.stream(Role.values())
                .filter(Role::isAssignableForEmployee)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        assignableRoleMap.put(SYS_ROOT, new HashSet<>(assinableForEmpRoles));
        assignableRoleMap.put(SYS_SERVICE_SEEKER, new LinkedHashSet<>(assinableForEmpRoles));
        assignableRoleMap.put(SYS_SERVICE_PROVIDER, new LinkedHashSet<>(assinableForEmpRoles));

    }

    private String label;
    private RoleCategory category;
    private boolean assignableForEmployee;

    Role(String label, RoleCategory category, boolean assignableForEmployee) {
        this.label = label;
        this.category = category;
        this.assignableForEmployee = assignableForEmployee;
    }

    public static Set<Role> getAssignableEmpRoles(RoleCategory roleCategory, Set<Role> assigneeAdminRoles) {

        return assigneeAdminRoles.stream()
                .flatMap(r -> Optional.ofNullable(assignableRoleMap.get(r)).orElse(Collections.emptySet()).stream())
                .filter(r -> r.getCategory() == roleCategory)
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public String getLabel() {
        return label;
    }

    public RoleCategory getCategory() {
        return category;
    }

    public boolean isAssignableForEmployee() {
        return assignableForEmployee;
    }
}
