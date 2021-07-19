package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.implementation.ArrayListHash;
import com.example.demo.implementation.Conversion;
import com.example.demo.implementation.CustomerImpl;
import com.example.demo.implementation.StringAppender;
import com.example.demo.models.CustomerResponseModel;
import com.example.demo.models.DemoResponseModel;
import com.example.demo.models.MyModel;
import com.example.demo.models.RequestCities;
import com.example.demo.models.RequestModel;
import com.example.demo.models.RequestObject;
import com.example.demo.models.ResponseCities;
import com.example.demo.models.ResponseHash;
import com.example.demo.models.ResponseModel;

@RestController

public class MyController {
	@Autowired
	private Conversion conversion;
	
	@Autowired
	private CustomerImpl impl;
	
	@GetMapping (path="/fullname")
	public DemoResponseModel method1(@RequestBody   RequestModel request) {
		
		StringAppender str1 = null ;//new StringAppender();
		
	String str2 =	str1.method(request.getFn(), request.getLn());
		
		DemoResponseModel demoResponseModel = new DemoResponseModel();
		demoResponseModel.setFullName(str2);
		System.out.println(demoResponseModel.toString());
		return demoResponseModel;	
		
	}
	
	
	
	
	@PostMapping (path="/city")
private ResponseCities myCities1(@RequestBody   RequestCities request) {
	
	
	ResponseCities response = conversion.myCities(request);
		
		return response;
		
	}
	
		
		
	@PostMapping (path="/hasharray")
	private ResponseHash meth4(@RequestBody   RequestObject request) {
		
		ArrayListHash det = new ArrayListHash();
		
		HashMap<Integer, String> det2 = det.meth1(request.getNumber(), request.getName());
			
		ResponseHash response = new ResponseHash();
		response.setDetails(det2);
			return response;
			
		}
		
		
	@GetMapping (value="/customer/{id}")
	private CustomerResponseModel  getcustomerdeatils(@PathVariable("id") int id) {
		
		CustomerResponseModel response =impl.getCustomerDetails(id);
		return response;
		
	}
	
	
	
	
	
	

}
