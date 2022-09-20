package com.example.accessingdatajpa.cotrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.accessingdatajpa.Customer;
import com.example.accessingdatajpa.CustomerRepository;
import com.example.accessingdatajpa.service.CustomerService;



@RestController
public class CustomerController {
	

	
	@Autowired
	private CustomerService service;
	
	@RequestMapping("/allrecord")
	
	public String getAllCustomer() {
		
		Iterable<Customer> obj = service.getAllCustomer();
		
		//lambda (1.8)   - >  function pointer 
		
		//FunctionalInterface    only one single abstract method 
		
		return "Success";
	}

}


