package com.example.demo.business.abstracts;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.concretes.Loan;
import com.example.demo.entities.concretes.LoanConfirmation;

public interface ILoanService {
	List<Loan> getAll();
	Optional<Loan> getById(Loan loan);
	public Loan addLoan(Loan loan,LoanConfirmation loanConfirmation) throws Exception;

}
