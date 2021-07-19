package com.example.demo.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.models.CustomerEntityModel;
import com.example.demo.models.CustomerResponseModel;
import com.example.demo.repositories.CustomerRepository;
@Component 
public class CustomerImpl {
	
	@Autowired
	private CustomerRepository repo;
	
	
	public CustomerResponseModel getCustomerDetails(int id) {
		
		Optional<CustomerEntityModel>  customerentity =repo.findById(id);
		
		CustomerEntityModel customerentitymodel = customerentity.get();
		
		CustomerResponseModel customerresponsemodel = new CustomerResponseModel();
		customerresponsemodel.setId(customerentitymodel.getId());
		customerresponsemodel.setAddress(customerentitymodel.getAddress());
		customerresponsemodel.setName(customerentitymodel.getName());
		customerresponsemodel.setPhonenumber(customerentitymodel.getPhonenumber());
		
		
		
		
		return customerresponsemodel;	
		
		
		
		
	}

}
