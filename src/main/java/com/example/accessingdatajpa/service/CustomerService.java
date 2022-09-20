package com.example.accessingdatajpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.accessingdatajpa.Customer;
import com.example.accessingdatajpa.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository  repo;
	
	public Iterable<Customer> getAllCustomer() {
		return repo.findAll();
		
	}

}
