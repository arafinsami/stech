package com.stech.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import com.stech.datatable.OrderParam;

public class StringUtils {

	public static final String FULL_TEST_SEARCH_META_CHARS = "[\\[\\]+*()<>@~\\-'\\\\]";

	public static boolean isNotEmpty(String str) {
		return Objects.nonNull(str) && str.trim().length() > 0;
	}
	
	public static boolean nonNull(Object object) {
		return Objects.nonNull(object);
	}

	public static boolean isEmpty(String str) {
		return !isNotEmpty(str);
	}

	public static boolean isEmpty(Integer integer) {
		return !isNotEmpty(integer);
	}

	public static boolean isNotEmpty(Integer integer) {
		return Objects.nonNull(integer);
	}

	public static boolean isNumericString(String code) {
		return code.matches("[0-9]+");
	}

	public static boolean isAnyEmpty(String... strings) {
		return Arrays.stream(strings).anyMatch(StringUtils::isEmpty);
	}

	public static boolean isAllNotEmpty(String... strings) {
		return Arrays.stream(strings).noneMatch(StringUtils::isEmpty);
	}
	
	
	public static String generateSqlOrderPart(List<OrderParam> orderParamList, Map<Integer, String> orderColumnMap, String priorityOrder) {
        StringBuilder orderStr = new StringBuilder();

        if (CollectionUtils.isNotEmpty(orderParamList)) {
            orderStr.append(" ORDER BY " + (StringUtils.isNotEmpty(priorityOrder) ? priorityOrder : ""));

            List<String> orderColumns = new ArrayList<>();
            orderParamList.forEach(o -> {
                orderColumns.add(StringUtils.joinWithDelimiter(" ", orderColumnMap.get(o.getColumn()), o.getDir()));
            });

            orderStr.append(StringUtils.joinWithDelimiter(", ", orderColumns.toArray(new String[orderColumns.size()])));
        }
        return orderStr.toString();
    }

	public static String joinWithDelimiter(String delimiter, String... values) {
		List<String> elements = Arrays.asList(values);

		StringBuilder sb = new StringBuilder("");
		elements.forEach(s -> {
			String str = StringUtils.isNotEmpty(s) ? s.trim() : "";

			if (sb.length() > 0) {
				sb.append(delimiter);
			}

			sb.append(str);
		});

		return sb.toString();
	}

	public static String appendWildCardInSearchValues(String searchVal) {
		return Arrays.stream(searchVal.split(" ")).map(StringUtils::escapeFullTextSearchMetaChar)
				.filter(StringUtils::isNotEmpty).map(s -> "+" + s + "*").collect(Collectors.joining(" "));
	}

	public static String escapeFullTextSearchMetaChar(String val) {
		return val.replaceAll(FULL_TEST_SEARCH_META_CHARS, "");
	}

	public static String[] splitString(String name) {
		return Arrays.stream(name.split(" ")).map(String::trim).toArray(String[]::new);
	}

	public static String[] toArray(List<String> stringList) {
		String[] stringArray = new String[0];
		return CollectionUtils.isEmpty(stringList) ? stringArray : stringList.toArray(stringArray);
	}
}
