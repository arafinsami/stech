package com.stech.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import com.stech.enums.ActivityAction;
import com.stech.enums.ModuleName;
import com.stech.utils.DateUtils;

import lombok.Data;

@Data
@Document(collection = "action_log")
public class ActionLog implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private Date created;

	@Enumerated(EnumType.STRING)
	@Column(length = 30)
	private ModuleName moduleName;

	@Enumerated(EnumType.STRING)
	@Column(length = 30)
	private ActivityAction action;

	private String userName;

	private String documentId;

	private String comments;

	private boolean publicRequest;

	private String ipAddress;

	public String getCreatedStr() {
		return DateUtils.format(this.created, DateUtils.DATE_TIME_FORMAT);
	}
}
