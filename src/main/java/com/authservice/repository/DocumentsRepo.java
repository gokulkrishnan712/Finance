package com.authservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.authservice.entity.Documents;

@Repository
public interface DocumentsRepo extends JpaRepository<Documents, Integer> {

}
