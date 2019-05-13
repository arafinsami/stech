package com.stech.helper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.stech.entity.CountryInfo;
import com.stech.entity.Profile;
import com.stech.enums.EducationBoard;
import com.stech.enums.EducationLevel;
import com.stech.enums.Gender;
import com.stech.enums.Industry;
import com.stech.enums.Participated;
import com.stech.enums.ProjectDuration;
import com.stech.repository.CountryInfoRepository;
import com.stech.repository.SubIndustryCommonDataRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProfileHelper {

	private final SubIndustryCommonDataRepository subIndustryRepository;
	private final CountryInfoRepository countryInfoRepository;

	public Profile createProfile() {
		return new Profile();
	}

	public void setReferenceData(Model model) {
		model.addAttribute("genders", Gender.values());
		model.addAttribute("industries", Industry.values());
		model.addAttribute("subIndustries", subIndustryRepository.findAll());

		List<CountryInfo> list = countryInfoRepository.findAll();

		List<String> postCodes = list.stream().map(CountryInfo::getPostCode).distinct().sorted()
				.collect(Collectors.toList());

		List<String> thanas = list.stream().map(CountryInfo::getThana).distinct().sorted().collect(Collectors.toList());

		List<String> districts = list.stream().map(CountryInfo::getDistrict).distinct().sorted()
				.collect(Collectors.toList());

		List<String> divisions = list.stream().map(CountryInfo::getDivision).distinct().sorted()
				.collect(Collectors.toList());

		List<String> countries = list.stream().map(CountryInfo::getCountry).distinct().sorted()
				.collect(Collectors.toList());

		model.addAttribute("postCodes", postCodes);
		model.addAttribute("thanas", thanas);
		model.addAttribute("districts", districts);
		model.addAttribute("divisions", divisions);
		model.addAttribute("countries", countries);
	}

	public void setEducationRefferenceData(Model model) {
		model.addAttribute("educationLevels", EducationLevel.values());
		model.addAttribute("educationBoards", EducationBoard.values());
	}

	public void setExperienceReferenceData(Model model) {
		model.addAttribute("industries", Industry.values());
		List<CountryInfo> list = countryInfoRepository.findAll();
		List<String> countries = list.stream().map(CountryInfo::getCountry).distinct().sorted()
				.collect(Collectors.toList());
		model.addAttribute("countries", countries);
		model.addAttribute("projectDurations", ProjectDuration.values());
		model.addAttribute("participated", Participated.values());
	}

	public void setReferenceData(Model model, Profile profile) {
		model.addAttribute("profile", profile);
	}
}
