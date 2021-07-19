package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.CustomerEntityModel;

public interface CustomerRepository extends CrudRepository<CustomerEntityModel, Integer>{

	
	

}
