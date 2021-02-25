package com.example.demo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.abstracts.ILoanConfirmationService;
import com.example.demo.entities.concretes.LoanConfirmation;

@RestController
@RequestMapping("/api/v1")
public class LoanConfirmationsController {
	
	@Autowired
	ILoanConfirmationService loanConfirmationService;
	
	@GetMapping("/loan_confirmation")
	public List<LoanConfirmation> getAll(){
		return loanConfirmationService.getAll();
	}
	
	@PutMapping("/loan_confirmation/{loan_id}")
		public ResponseEntity<LoanConfirmation> updateConfirmation(@PathVariable(value="loan_id")Integer loanId,@RequestBody LoanConfirmation loanConfirmation)throws Exception{
		     return loanConfirmationService.updateConfirmation(loanId, loanConfirmation);
	}
	

}
