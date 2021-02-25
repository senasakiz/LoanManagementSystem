package com.example.demo.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.ICustomerService;
import com.example.demo.dataaccess.concretes.CustomerRepository;
import com.example.demo.entities.concretes.Customer;

@Service
public class CustomerManager implements ICustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getAll() {
		return customerRepository.findAll();
	}

	@Override
	public Optional<Customer> getById(Customer customer) {
		int customerId=customer.getCustomerId();
		return customerRepository.findById(customerId);
	}

	@Override
	public Customer addCustomer(Customer customer) {
		String identityNumber=customer.getIdentityNumber();
		List<Customer> customerList=customerRepository.findCustomer(identityNumber);
		
		if(customerList.isEmpty()) {
			System.out.println("kayıt yapıldı");
			return customerRepository.save(customer);
		}
		else {
			System.out.println("bu kayıt sistemde mevcut");
			return customer;
		}
	}

	@Override
	public List<Customer> getByIdentityNumber(String identityNumber) {
		return customerRepository.findCustomer(identityNumber);
	}
	

}
