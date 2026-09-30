package com.trainee.spring.demo.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainee.spring.demo.address.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {


}
