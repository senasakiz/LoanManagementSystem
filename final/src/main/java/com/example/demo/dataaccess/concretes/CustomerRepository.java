package com.example.demo.dataaccess.concretes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.concretes.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{
	@Query(value="SELECT * from customers where identity_number=?1",nativeQuery=true)
	List<Customer> findCustomer(String identityNumber);

}
