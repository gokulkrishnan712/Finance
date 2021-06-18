package com.authservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.authservice.entity.Address;


@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

}
