package com.stech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stech.entity.Profile;
import com.stech.entity.User;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {

	Profile findByUser(User user);

}
