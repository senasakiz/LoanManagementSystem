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

import com.example.demo.business.abstracts.ILoanConfirmationService;
import com.example.demo.business.abstracts.ILoanService;
import com.example.demo.entities.concretes.Loan;
import com.example.demo.entities.concretes.LoanConfirmation;

@RestController
@RequestMapping("/api/v1")
public class LoansController {
	@Autowired
	ILoanService loanService;
	
	@Autowired
	ILoanConfirmationService loanConfirmationService;
	
	@GetMapping("/loans")
	public List<Loan> getAll(){
		return loanService.getAll();
	}
	
	@GetMapping("/loans/{loan_id}")
	public Optional<Loan> getById(@PathVariable(value="loan_id")Loan loan){
		return loanService.getById(loan);
	}
	
	@PostMapping("/loans")
	public Loan add(@RequestBody Loan loan,LoanConfirmation loanConfirmation) throws Exception {
		return loanService.addLoan(loan,loanConfirmation);
		
	}
	

}
