package com.stech.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.parseInt;
import static java.time.LocalTime.of;
import static java.time.format.DateTimeFormatter.ofPattern;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class DateUtils {

	public static final String DATE_FORMAT = "dd/MM/yyyy";

	public static final String DATE_FORMAT_INT = "yyyyMMdd";

	public static final String DATE_TIME_FORMAT = "dd/MM/yyyy hh:mm a";

	public static String TIME_FORMAT = "hh:mm a";

	public static final Map<String, String> TIME_PATTERN_FORMAT_MAP;

	static {
		TIME_PATTERN_FORMAT_MAP = new HashMap<>();
		TIME_PATTERN_FORMAT_MAP.put("^(1[0-2]):[0-5][0-9](\\s)?(am|AM|pm|PM)$", "hh:mm a");
		TIME_PATTERN_FORMAT_MAP.put("^(0[0-9]):[0-5][0-9](\\s)?(am|AM|pm|PM)$", "hh:mm a");
		TIME_PATTERN_FORMAT_MAP.put("^([0-9]):[0-5][0-9](\\s)?(am|AM|pm|PM)$", "h:mm a");
	}

	public static String format(Date date) {
		return format(date, DATE_FORMAT);
	}

	public static String format(Date date, String format) {
		return isNull(date) ? null : new SimpleDateFormat(format).format(date);
	}

	public static Integer getDateInt(Date date) {
		if (isNull(date)) {
			throw new IllegalArgumentException("Date must not be NULL");
		}

		return parseInt(format(date, DATE_FORMAT_INT));
	}

	public static Date parse(String dateStr, String format) {
		SimpleDateFormat sfd = new SimpleDateFormat(format);
		try {
			return sfd.parse(dateStr);
		} catch (ParseException e) {
			return null;
		}
	}

	public static LocalDateTime convertToLocalDateTime(Date dateToConvert) {
		return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	}

	public static Date getToday() {
		return Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
	}

	public static int getTimeInMinute(String time) {
		String pattern = findPattern(time);

		if (StringUtils.isEmpty(pattern)) {
			throw new RuntimeException();
		}

		DateTimeFormatter formatter = ofPattern(pattern);
		LocalTime lt = LocalTime.parse(time.toUpperCase(), formatter);
		return lt.getHour() * 60 + lt.getMinute();
	}

	public static String formatTime(int timeInt) {
		return formatTime(timeInt, TIME_FORMAT);
	}

	public static String formatTime(int timeInt, String pattern) {
		return ofPattern(pattern).format(of(timeInt / 60, timeInt % 60));
	}

	public static String findPattern(String time) {
		String t = time.toUpperCase();
		for (String k : TIME_PATTERN_FORMAT_MAP.keySet()) {
			if (t.matches(k)) {
				return TIME_PATTERN_FORMAT_MAP.get(k);
			}
		}

		return null;
	}

	public static boolean isValidTime(String timeStr) {
		return nonNull(findPattern(timeStr));
	}
}
