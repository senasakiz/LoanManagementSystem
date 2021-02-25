package com.example.demo.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.abstracts.ICustomerService;
import com.example.demo.entities.concretes.Customer;

@RestController
@RequestMapping("/api/v1")
public class CustomersController {
	@Autowired
	ICustomerService customerService;
	
	@GetMapping("/customers")
	public List<Customer> getAll(){
		return customerService.getAll();
	}
	
	@GetMapping("/customers/{customer_id}")
	public Optional<Customer> getById(@PathVariable(value="customer_id")Customer customer){
		return customerService.getById(customer);
	}
	
	@GetMapping("/customers/name/{identity_number}")
	public List<Customer> getByIdentityNumber(@PathVariable(value="identity_number", required = true) String identityNumber)throws Exception{
		
		List<Customer> list = customerService.getByIdentityNumber(identityNumber);
		
		if(list == null) {
            System.out.println("Kullanıcı bulunamadı!");
        }
        return customerService.getByIdentityNumber(identityNumber);
	}
	
	@PostMapping("/customers")
	public Customer add(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
		
	}

}
