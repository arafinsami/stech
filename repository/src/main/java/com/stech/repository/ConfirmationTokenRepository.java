package com.stech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stech.entity.ConfirmationToken;
import com.stech.enums.Status;

@Repository
public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationToken, Long> {

	ConfirmationToken findByConfirmationTokenAndStatus(String confirmationToken,Status status);
}
