package com.stech.datatable;

import lombok.Data;

@Data
public class SearchParam {

	private String column;

	private String columnSearchValue;

	private String value;

	private boolean regex;

	@Override
	public String toString() {
		return "SearchParam{" + "column='" + column + '\'' + ", columnSearchValue='" + columnSearchValue + '\''
				+ ", value='" + value + '\'' + ", regex=" + regex + '}';
	}
}