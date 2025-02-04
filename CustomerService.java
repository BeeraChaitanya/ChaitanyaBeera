package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.CustomerController;
import com.example.demo.entity.Customer;


@Service
public class CustomerService {
	
	
	@Autowired
	public CustomerService cusRepo;
	public void save(CustomerController cusData) {
		// TODO Auto-generated method stub
		
	}

	public void saveCustomerNewRecord(CustomerController cusData) {
		
		
		cusRepo.save(cusData);
	}
	public void saveAll(List<Customer> cusList) {
		// TODO Auto-generated method stub
		
	}



	public void saveAllStudents(List<Customer> cusList) {
	cusRepo.saveAll(cusList);
	}

	public void saveCustomerNewRecord1(com.example.demo.controller.CustomerController cusData) {
		// TODO Auto-generated method stub
		
	}

	public void saveAllCustomer(List<com.example.demo.controller.CustomerController> cusList) {
		// TODO Auto-generated method stub
		
	}
}