package com.stech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stech.entity.SubIndustryCommonData;
import com.stech.enums.Industry;

@Repository
public interface SubIndustryCommonDataRepository extends JpaRepository<SubIndustryCommonData, Long> {

	List<SubIndustryCommonData> findByIndustry(Industry industry);
}
