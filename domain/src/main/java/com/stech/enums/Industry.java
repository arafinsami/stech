package com.stech.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.stech.utils.CollectionUtils;

public enum Industry {

	CHEMICAL("Chemical"), SOFTWARE("Software"), CIVIL("Civil");

	private String label;

	Industry(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public static Industry resolveFromLabel(String label) {

		String l = label.replaceAll(" ", "");
		return Arrays.stream(values()).filter(t -> t.getLabel().replaceAll(" ", "").equalsIgnoreCase(l)).findAny()
				.orElse(null);
	}

	public static List<Industry> search(String value) {
		List<Industry> types = Arrays.stream(Industry.values())
				.filter(t -> t.getLabel().toLowerCase().matches(".*" + value.toLowerCase() + ".*"))
				.collect(Collectors.toList());

		return CollectionUtils.isNotEmpty(types) ? types : null;
	}

}
