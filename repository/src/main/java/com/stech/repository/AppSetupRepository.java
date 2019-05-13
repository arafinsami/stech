package com.stech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stech.entity.AppSetup;


@Repository
public interface AppSetupRepository extends JpaRepository<AppSetup, Long> {

}
