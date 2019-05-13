package com.stech.repository.mongo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stech.entity.UserActivityLog;

@Repository
public interface UserActivityLogRepository extends CrudRepository<UserActivityLog, String> {

	Page<UserActivityLog> findAllByOrderByCreatedDesc(Pageable pageable);

	List<UserActivityLog> findByUserName(String userName);

	UserActivityLog findByAuthIdAndUserName(String authId, String userName);
}
