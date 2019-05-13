package com.stech.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class CompanySetting extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String firstAdminName;

	private String firstAdminDesignation;

	private String firstAdminDepartment;

	private String firstAdminEmail;

	private String firstAdminCompanyIdNo;

	private String firstAdminMobileNo;

	private String firstAdminAttachment;

	private String secondAdminName;

	private String secondAdminDesignation;

	private String secondAdminDepartment;

	private String secondAdminEmail;

	private String secondAdminCompanyIdNo;

	private String secondAdminMobileNo;

}
