package com.authservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.authservice.entity.AdminDetails;

@Repository
public interface AdminDetailsRepo extends JpaRepository<AdminDetails, Long> {
	
	AdminDetails findByUserName(String userName);

}
