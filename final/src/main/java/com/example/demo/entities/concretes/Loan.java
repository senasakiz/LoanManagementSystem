package com.example.demo.entities.concretes;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.example.demo.entities.abstracts.IEntity;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="loans")
@SecondaryTable(name="loan_confirmation")
public class Loan implements IEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="loan_id")
	private int loanId;
	
	@Column(name="customer_id")
	private int customerId;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate subscriptionDate;
	
	
	@Column(name="loan_limit")
	private double loanLimit=0;
	
	@Column(name="bill_score")
	private double billScore;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	

	@Column(name="loan_request_date")
	@CreationTimestamp
	private Date loanRequestDate;
	
	
	
	
	
	
	
	
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

	
	public Date getLoanRequestDate() {
		return loanRequestDate;
	}

	public void setLoanRequestDate(Date loanRequestDate) {
		this.loanRequestDate = loanRequestDate;
	}


	public void setSubscriptionDate(LocalDate subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}

	public double getBillScore() {
		return billScore;
	}

	public void setBillScore(double billScore) {
		this.billScore = billScore;
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public LocalDate getSubscriptionDate() {
		return subscriptionDate;
	}

	public void setLoanDate(LocalDate subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}


}
