package com.stech.service;

import static java.util.stream.Collectors.toList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.stech.datatable.DataTableResponse;
import com.stech.datatable.DataTableSearchParam;
import com.stech.dto.SubIndustryCommonDataDto;
import com.stech.entity.SubIndustryCommonData;
import com.stech.enums.Industry;
import com.stech.repository.SubIndustryCommonDataRepository;
import com.stech.utils.StringUtils;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class IndustryCommonDataService {

	private final SubIndustryCommonDataRepository repository;
	private final EntityManager em;

	private static final Map<Integer, String> commonDataOrderColumnMap = new HashMap<>();
	private static final Map<String, String> commonDataSearchColumnMap = new HashMap<>();

	static {
		commonDataOrderColumnMap.put(0, "c.industry");
		commonDataOrderColumnMap.put(1, "c.subIndustry");

		commonDataSearchColumnMap.put("industry", " c.industry IN :param1");
		commonDataSearchColumnMap.put("subIndustry", " c.subIndustry LIKE :param1");
	}
	
	@Transactional
	public void saveAll(Set<SubIndustryCommonData> data) {
		repository.saveAll(data);
	}

	public DataTableResponse<SubIndustryCommonDataDto> search(DataTableSearchParam searchParam) {
		String selectQueryStr = "SELECT c FROM SubIndustryCommonData c";
		String countQueryStr = "SELECT COUNT(c) FROM SubIndustryCommonData c";

		Map<String, Object> paramMap = new HashMap<>();
		String searchCondition = "";
		boolean whereAdded = false;
		if (StringUtils.isNotEmpty(searchParam.getGlobalSearchValue())) {
			searchCondition = searchCondition + " WHERE " + " ((c.subIndustry LIKE :searchValue) "
					+ " OR (c.industry IN (:types)))";

			paramMap.put("searchValue", "%" + searchParam.getGlobalSearchValue() + "%");
			paramMap.put("types", Industry.search(searchParam.getGlobalSearchValue()));
			whereAdded = true;
		}

		if (StringUtils.isNotEmpty(searchParam.getSearchColumn())
				&& StringUtils.isNotEmpty(searchParam.getSearchColumnValue())) {
			searchCondition = searchCondition + (whereAdded ? " AND " : " WHERE ")
					+ commonDataSearchColumnMap.get(searchParam.getSearchColumn());
			switch (searchParam.getSearchColumn()) {
			case "type":
				paramMap.put("param1", Industry.search(searchParam.getSearchColumnValue()));
				break;
			default:
				paramMap.put("param1", "%" + searchParam.getSearchColumnValue() + "%");
			}
		}

		String orderStr = StringUtils.generateSqlOrderPart(searchParam.getOrder(), commonDataOrderColumnMap, null);
		TypedQuery<Long> countQuery = em.createQuery(countQueryStr + searchCondition, Long.class);
		TypedQuery<Long> allCountQuery = em.createQuery(countQueryStr, Long.class);

		TypedQuery<SubIndustryCommonData> query = em.createQuery(selectQueryStr + searchCondition + orderStr,
				SubIndustryCommonData.class);

		paramMap.forEach((k, v) -> {
			countQuery.setParameter(k, v);
			query.setParameter(k, v);
		});

		query.setFirstResult(searchParam.getStart());
		query.setMaxResults(searchParam.getLength());

		List<SubIndustryCommonData> rxSuggestions = query.getResultList();

		return new DataTableResponse<>(rxSuggestions.stream().map(SubIndustryCommonDataDto::select).collect(toList()),
				allCountQuery.getSingleResult(), countQuery.getSingleResult());
	}
}




