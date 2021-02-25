package com.example.demo.business.abstracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.entities.concretes.LoanConfirmation;


public interface ILoanConfirmationService {
	List<LoanConfirmation> getAll();
	public LoanConfirmation addLoanConfirmation(LoanConfirmation loanConfirmation);
	public ResponseEntity<LoanConfirmation> updateConfirmation(Integer loanId,LoanConfirmation loanConfirmation) throws Exception;

}
