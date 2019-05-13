package com.stech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.stech.enums.EducationBoard;
import com.stech.enums.EducationLevel;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String instituteName;

	@Enumerated(EnumType.STRING)
	@Column(length = 3)
	private EducationLevel educationLevel;

	@Enumerated(EnumType.STRING)
	@Column(length = 16)
	private EducationBoard educationBoard;

	private String passingYear;
}
