package com.trainee.spring.demo.address.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trainee.spring.demo.address.model.Address;
import com.trainee.spring.demo.address.service.AddressService;

@RestController
public class AddressController {
	private static final Logger logger = LoggerFactory.getLogger(AddressController.class);

	@Autowired
	private AddressService service;

	@PostMapping("/addAddress")
	public Address addAddress(@RequestBody Address addAddress) {
		return service.saveAddress(addAddress);

	}
	
	@GetMapping("/getAddress/{id}")
	public Address getAddress(@PathVariable long id) {
		return service.getAddress(id);
		
		
	}


}
