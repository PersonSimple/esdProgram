package com.example.accessingdatajpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.accessingdatajpa.model.Customer;
import com.example.accessingdatajpa.repository.CustomerRepository;

@Service
public class CustomerService {
	
	
	
	@Autowired
	private CustomerRepository repository;

	
	
	public Optional<Customer> getCustomerById(Long id) {
		return repository.findById(id);
	}

	
	public Iterable<Customer> getAllCustomer() {
		return repository.findAll();
	}

	
	public  String addCustomer(@RequestBody Customer customer) {
		repository.save(customer);
		return " saved ";

	}
	
	public  String deleteCustomerByid(Long id) {
		 repository.deleteById(id);
		 return "deleted";
	}
	

	public  String updateCustomer(Customer newCustomer ,Long id) {
		 
		  Customer customer = repository.findById(id).get();
		  
		  customer.setAddress(newCustomer.getAddress());
		  customer.setFirstName(newCustomer.getFirstName());
		  customer.setLastName(newCustomer.getLastName());
		  
		  repository.save(customer);
		 return "updated";
	}
	
}
