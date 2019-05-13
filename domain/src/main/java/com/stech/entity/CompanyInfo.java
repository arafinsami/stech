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
public class CompanyInfo extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String faxNo;

	private String binNo;

	private String tinNo;

	private String vatRegNo;

	private String companyRegNo;

	private String companyRegYear;

	private String ceoName;

	private String ceoPhoneNo;

	private String ceoEmail;

	private String websiteLink;

}
