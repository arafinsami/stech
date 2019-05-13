package com.stech.repository.mongo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stech.entity.ActionLog;

@Repository
public interface ActionLogRepository extends CrudRepository<ActionLog, String> {

}
