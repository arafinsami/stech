package com.stech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stech.entity.CountryInfo;

@Repository
public interface CountryInfoRepository extends JpaRepository<CountryInfo, Long> {
	
	List<CountryInfo> findByCountry(String country);
	
	List<CountryInfo> findByDivision(String division);
	
	List<CountryInfo> findByDistrict(String district);
	
	List<CountryInfo> findByThana(String thana);
}
