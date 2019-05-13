package com.stech.datatable;

import lombok.Data;

@Data
public class OrderParam {

	private Integer column;

	private String dir;

	@Override
	public String toString() {
		return "OrderParam{" + "column=" + column + ", dir='" + dir + '\'' + '}';
	}
}