package com.stech.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.UniqueConstraint;

import com.stech.enums.Gender;
import com.stech.enums.Industry;
import com.stech.enums.Services;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Profile extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String fullName;

	private String phoneNo;

	private String nId;

	private String country;

	private String division;

	private String district;

	private String thana;

	private String postCode;

	private String presentAddress;

	private String permanentAddress;

	@Enumerated(EnumType.STRING)
	@Column(length = 6)
	private Gender gender;

	@ManyToOne
	@JoinColumn(name = "photo_id", nullable = true)
	private Attachment photo;

	@OneToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private User user;

	@ElementCollection(fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	@Column(name = "services", length = 32)
	@CollectionTable(name = "profile_services", uniqueConstraints = @UniqueConstraint(columnNames = { "profile_id",
			"services" }))
	private Set<Services> services;

	@ElementCollection(fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	@Column(name = "industry", length = 32)
	@CollectionTable(name = "profile_industry", uniqueConstraints = @UniqueConstraint(columnNames = { "profile_id",
			"industry" }))
	private Set<Industry> industry;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable
	private List<SubIndustryCommonData> subIndustry;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable
	private List<Skill> skills;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable
	private List<Education> educations;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable
	private List<Experience> experiences;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable
	private List<CompanyInfo> companyInfos;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable
	private List<CompanySetting> companySettings;

	public void addSkill(Skill skill) {
		if (skills == null) {
			skills = new ArrayList<>();
		}
		skills.add(skill);
	}

	public void addEducation(Education education) {
		if (educations == null) {
			educations = new ArrayList<>();
		}
		educations.add(education);
	}

	public void addExperience(Experience experience) {
		if (experiences == null) {
			experiences = new ArrayList<>();
		}
		experiences.add(experience);
	}

	public void addCompanyInfo(CompanyInfo companyInfo) {
		if (companyInfos == null) {
			companyInfos = new ArrayList<>();
		}
		companyInfos.add(companyInfo);
	}

	public void addCompanySetting(CompanySetting companySetting) {
		if (companySettings == null) {
			companySettings = new ArrayList<>();
		}
		companySettings.add(companySetting);
	}

}
