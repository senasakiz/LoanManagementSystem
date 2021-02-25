package com.example.demo.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.entities.abstracts.IEntity;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="customers")
public class Customer implements IEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customer_id")
	private int customerId;
	@Column(name="identity_number")
	private String identityNumber;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="gsm_no")
	private String gsmNo;
	@Column(name="address")
	private String address;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate birthday;
	
	enum customerType{
		postpaid,
		prepaid;
	}
	
	@Column(name="customer_type")
	@Enumerated(EnumType.STRING)
	private customerType customertype;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate subscriptionDate;
	
	
	
	
	
	
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public customerType getCustomertype() {
		return customertype;
	}
	public void setCustomertype(customerType customertype) {
		this.customertype = customertype;
	}
	public LocalDate getSubscriptionDate() {
		return subscriptionDate;
	}
	public void setSubscriptionDate(LocalDate subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}
	
	
	
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
	public String getGsmNo() {
		return gsmNo;
	}
	public void setGsmNo(String gsmNo) {
		this.gsmNo = gsmNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


	

}
