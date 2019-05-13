package com.stech.entity;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.stech.enums.AccountStatus;
import com.stech.enums.Role;
import com.stech.enums.UserCategory;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "hibernate-second-level")
public class User extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	private String userName;

	@NotNull
	private String password;

	@NotNull
	@Column(length = 15)
	private String phoneNumber;

	@NotNull
	@Email
	private String email;

	@Transient
	private String confirmPassword;
	
	@Enumerated(EnumType.STRING)
	private UserCategory userCategory;

	@Enumerated(EnumType.STRING)
	private AccountStatus accountStatus;

	@ElementCollection(fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	@Column(name = "role", length = 32)
	@CollectionTable(name = "user_role", uniqueConstraints = @UniqueConstraint(columnNames = { "user_id", "role" }))
	private Set<Role> roles;

	public boolean isActive() {
		return this.accountStatus == AccountStatus.ACTIVE;
	}

	public boolean isInactive() {
		return this.accountStatus == AccountStatus.INACTIVE;
	}

	public boolean isPendingActivation() {
		return this.accountStatus == AccountStatus.PENDING_VERIFICATION;
	}

	public boolean isNew() {
		return this.id == 0;
	}
}
