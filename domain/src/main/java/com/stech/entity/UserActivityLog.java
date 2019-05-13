package com.stech.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import com.stech.utils.DateUtils;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(collection = "user_activity_log")
@NoArgsConstructor
public class UserActivityLog implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private Date created;

	private String action;

	private Long userId;

	private String userName;

	private String ipAddress;

	@Column(length = 1000)
	private String authId;

	public String getCreatedStr() {
		return DateUtils.format(this.created, DateUtils.DATE_TIME_FORMAT);
	}
}
