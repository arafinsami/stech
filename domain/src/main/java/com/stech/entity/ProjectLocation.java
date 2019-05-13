package com.stech.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class ProjectLocation extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String fullAddress;

	@OneToOne
	@JoinColumn(name = "country_id")
	private CountryInfo country;

	@OneToOne
	@JoinColumn(name = "provience_id")
	private CountryInfo provience;

	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
}
