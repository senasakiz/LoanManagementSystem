package com.example.demo.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.entities.abstracts.IEntity;

@Entity
@Table(name="black_list")
public class BlackList implements IEntity{
	
	@Id
	@Column(name="customer_id")
	private int customerId;
	@Column(name="identity_number")
	private String identityNumber;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	
	
	
	
	
	
	
	
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
