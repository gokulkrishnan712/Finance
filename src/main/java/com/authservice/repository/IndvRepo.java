package com.authservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.authservice.entity.Indv;

@Repository
public interface IndvRepo extends JpaRepository<Indv, Integer> {

}
