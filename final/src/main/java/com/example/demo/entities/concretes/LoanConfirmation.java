package com.example.demo.entities.concretes;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.example.demo.entities.abstracts.IEntity;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="loan_confirmation")
public class LoanConfirmation implements IEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="loan_id")
	private int loanId;

	@Column(name="customer_id")
	private int customerId;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate subscriptionDate;
	
	
	@Column(name="loan_limit")
	private double loanLimit;
	
	@Column(name="bill_score")
	private double billScore;
	
	
	@Column(name="loan_request_date")
	@CreationTimestamp
	private Date loanRequestDate;
	
	public int getLoanId() {
		return loanId;
	}
	
	@Column(name="loan_status")
	private String loanStatus="onay bekliyor";


	
	
	
	
	
	
	public String getLoanStatus() {
		return loanStatus;
	}


	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
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


	public LocalDate getSubscriptionDate() {
		return subscriptionDate;
	}


	public void setSubscriptionDate(LocalDate subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}


	public double getLoanLimit() {
		return loanLimit;
	}


	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}


	public double getBillScore() {
		return billScore;
	}


	public void setBillScore(double billScore) {
		this.billScore = billScore;
	}


	public Date getLoanRequestDate() {
		return loanRequestDate;
	}


	public void setLoanRequestDate(Date loanRequestDate) {
		this.loanRequestDate = loanRequestDate;
	}

	

}
