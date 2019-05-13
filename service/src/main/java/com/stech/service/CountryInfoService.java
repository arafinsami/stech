package com.stech.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.stech.datatable.DataTableResponse;
import com.stech.datatable.DataTableSearchParam;
import com.stech.datatable.OrderParam;
import com.stech.dto.CountryInfoDto;
import com.stech.entity.CountryInfo;
import com.stech.repository.CountryInfoRepository;
import com.stech.utils.CollectionUtils;
import com.stech.utils.StringUtils;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CountryInfoService {

	private final EntityManager em;

	private final CountryInfoRepository countryInfoRepository;

	@Transactional
	public void saveAll(Set<CountryInfo> info) {
		countryInfoRepository.saveAll(info);
	}

	private static final Map<Integer, String> userColumnMap = new HashMap<>();

	static {
		userColumnMap.put(0, "country");
		userColumnMap.put(1, "division");
		userColumnMap.put(2, "district");
		userColumnMap.put(3, "thana");
		userColumnMap.put(4, "postCode");
	}

	public DataTableResponse<CountryInfoDto> search(DataTableSearchParam searchParam) {

		String selectQueryStr = "SELECT c FROM CountryInfo c";
		String countQueryStr = "SELECT COUNT(c) FROM CountryInfo c";
		StringBuilder condition = new StringBuilder();

		if (StringUtils.isNotEmpty(searchParam.getGlobalSearchValue())) {
			condition.append(" WHERE c.country LIKE :searchValue " + "OR c.division LIKE :searchValue "
					+ "OR c.district LIKE :searchValue " + "OR c.thana LIKE :searchValue "
					+ "OR c.postCode LIKE :searchValue ");
		}

		List<OrderParam> orderParamList = searchParam.getOrder();

		if (CollectionUtils.isNotEmpty(orderParamList)) {

			condition.append(" ORDER BY ");
			List<String> orderColumns = new ArrayList<>();
			orderParamList.forEach(o -> {
				orderColumns.add(StringUtils.joinWithDelimiter(" ", userColumnMap.get(o.getColumn()), o.getDir()));
			});

			condition
					.append(StringUtils.joinWithDelimiter(", ", orderColumns.toArray(new String[orderColumns.size()])));
		}

		Query countQuery = em.createQuery(countQueryStr + condition, Long.class);
		Query allCountQuery = em.createQuery(countQueryStr, Long.class);

		TypedQuery<CountryInfo> query = em.createQuery(selectQueryStr + condition, CountryInfo.class);
		if (StringUtils.isNotEmpty(searchParam.getGlobalSearchValue())) {
			countQuery.setParameter("searchValue", "%" + searchParam.getGlobalSearchValue() + "%");
			query.setParameter("searchValue", "%" + searchParam.getGlobalSearchValue() + "%");
		}

		query.setFirstResult(searchParam.getStart());
		query.setMaxResults(searchParam.getLength());

		List<CountryInfo> drugList = query.getResultList();

		DataTableResponse<CountryInfoDto> dataTableResponse = new DataTableResponse<>();
		dataTableResponse.setData(drugList.stream().map(CountryInfoDto::select).collect(Collectors.toList()));
		dataTableResponse.setRecordsFiltered((Long) countQuery.getSingleResult());
		dataTableResponse.setRecordsTotal((Long) allCountQuery.getSingleResult());
		return dataTableResponse;
	}
}
