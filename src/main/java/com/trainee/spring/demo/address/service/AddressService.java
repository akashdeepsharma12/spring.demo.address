package com.trainee.spring.demo.address.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainee.spring.demo.address.model.Address;
import com.trainee.spring.demo.address.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository repository;

	public Address saveAddress(Address add) {
		return repository.save(add);

	}

	public Address getAddress(long id) {
		return repository.findById(id).orElse(null);
	}
	

}
