package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CustomerService;

@RestController

public class CustomerController {
	
	@Autowired
	CustomerService cusSer;
	
	@PostMapping("/hotel/customer/add")
	public String addNewCustomer(@RequestBody CustomerController cusData){
		
		
		cusSer.saveCustomerNewRecord(cusData);
		return "successfully added new record----->";
		
	}
	@PostMapping("/stpeters/college/student/add/all")
	public String addNewCustomer(@RequestBody List<CustomerController> cusList){
		
		
	  cusSer.saveAllCustomer(cusList);
		
		return "successfully added all records----->";
		
	}
}