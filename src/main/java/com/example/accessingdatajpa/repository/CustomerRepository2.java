package com.example.accessingdatajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.accessingdatajpa.Customer;

@EnableJpaRepositories
public interface CustomerRepository2 extends CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);

	Customer findById(long id);
    
    public  Iterable<Customer> findAll() ;
}
