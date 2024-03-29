package com.authservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.authservice.entity.Loan;

@Repository
public interface LoanRepo extends JpaRepository<Loan, Integer> {

}
