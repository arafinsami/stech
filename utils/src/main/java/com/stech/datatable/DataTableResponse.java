package com.stech.datatable;

import java.util.List;

import lombok.Data;

@Data
public class DataTableResponse<E> {

	private List<E> data;

	private long recordsTotal;

	private long recordsFiltered;

	private String error;

	public DataTableResponse() {
	}

	public DataTableResponse(List<E> data, long recordsTotal, long recordsFiltered) {
		this.data = data;
		this.recordsTotal = recordsTotal;
		this.recordsFiltered = recordsFiltered;
	}
}

