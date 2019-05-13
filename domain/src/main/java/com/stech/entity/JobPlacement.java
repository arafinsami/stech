package com.stech.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.stech.enums.Assignment;
import com.stech.enums.Budget;
import com.stech.enums.JobNature;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class JobPlacement extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String assignmentTitle;

	private String companyName;

	private String companyBriefProfile;

	private Integer yearsOfExperience;

	private Integer noOfSnapShots;

	private Integer maximumPdsNumber;

	private String jobDescription;

	private String additionalRequirements;

	private String opinion;

	private String otherInfo;

	private String projectLocation;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "industry_id")
	private SubIndustryCommonData industry;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sub_industry_id")
	private SubIndustryCommonData subIndustry;

	@OneToOne
	@JoinColumn(name = "country_id")
	private CountryInfo country;

	@OneToOne
	@JoinColumn(name = "provience_id")
	private CountryInfo provience;

	@Enumerated(EnumType.STRING)
	@Column(length = 2)
	private Assignment assignment;

	@Enumerated(EnumType.STRING)
	@Column(length = 2)
	private JobNature jobNature;

	@ManyToMany
	@JoinTable(name = "jobplacement_consultant_specializations", joinColumns = @JoinColumn(name = "job_placement_id"), inverseJoinColumns = @JoinColumn(name = "consultant_specialization_id"))
	private Set<ConsultantCommonData> specializations;

	@ManyToMany
	@JoinTable(name = "jobplacement_consultant_degrees", joinColumns = @JoinColumn(name = "job_placement_id"), inverseJoinColumns = @JoinColumn(name = "consultant_degree_id"))
	private Set<ConsultantCommonData> degrees;

	@ManyToMany
	@JoinTable(name = "jobplacement_consultant_services", joinColumns = @JoinColumn(name = "job_placement_id"), inverseJoinColumns = @JoinColumn(name = "consultant_service_id"))
	private Set<ConsultantCommonData> services;

	@Enumerated(EnumType.STRING)
	@Column(length = 2)
	private Budget budget;

	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;

}
