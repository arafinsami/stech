package com.stech.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.stech.enums.Industry;
import com.stech.enums.Participated;
import com.stech.enums.ProjectDuration;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Experience extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String projectName;

	private String country;

	private String projectLocation;

	private String clientName;

	@Enumerated(EnumType.STRING)
	private Industry industry;

	@Enumerated(EnumType.STRING)
	@Column(length = 10)
	private ProjectDuration projectDuration;

	@Enumerated(EnumType.STRING)
	@Column(length = 10)
	private Participated participated;

	private Integer stuffNumber;

	private Integer stuffMonthsNumber;

	private Date startDate;

	private Date completionDate;

	private Integer totalDuration;

	private Integer appValueOfServices;

	private String financeSource;

	private String associatedConsutantOrFirm;

	private String firmName;

	private String projectAssesmentAttachment;

}
