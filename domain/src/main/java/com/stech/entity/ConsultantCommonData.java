package com.stech.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import com.stech.enums.ConsultantCommonDataType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class ConsultantCommonData extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @NonNull
    @Enumerated(EnumType.STRING)
    private ConsultantCommonDataType type;

    @NonNull
    @NotBlank
    private String value;

    @Override
    public String toString() {
        return value;
    }

}
