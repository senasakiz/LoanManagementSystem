package com.example.demo.business.abstracts;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.concretes.Customer;

public interface ICustomerService {
	List<Customer> getAll();
	Optional<Customer> getById(Customer customer);
	public List<Customer> getByIdentityNumber(String identityNumber);
	public Customer addCustomer(Customer customer);
	
	

}
