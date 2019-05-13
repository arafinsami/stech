package com.stech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.stech.entity.Pds;

@Repository
public interface PdsRepository extends JpaRepository<Pds, Long> {

	@Query(value = "SELECT * FROM PDS t WHERE album_id=?1", nativeQuery = true)
	List<Pds> findAllByActId(Long actId);
}
