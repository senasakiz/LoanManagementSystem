package com.example.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.ILoanConfirmationService;
import com.example.demo.dataaccess.concretes.LoanConfirmationRepository;
import com.example.demo.dataaccess.concretes.LoanRepository;
import com.example.demo.entities.concretes.Loan;
import com.example.demo.entities.concretes.LoanConfirmation;

@Service
public class LoanConfirmationManager implements ILoanConfirmationService{
	
	@Autowired
	private LoanConfirmationRepository loanConfirmationRepository;
	
	@Autowired
	private LoanRepository loanRepository;

	@Override
	public List<LoanConfirmation> getAll() {
		return loanConfirmationRepository.findAll();
	}

	@Override
	public LoanConfirmation addLoanConfirmation(LoanConfirmation loanConfirmation) {
		return loanConfirmationRepository.save(loanConfirmation);
	}

	@Override
	public ResponseEntity<LoanConfirmation> updateConfirmation(Integer loanId,LoanConfirmation loanConfirmation)throws Exception {
		LoanConfirmation updateToConfirmation=loanConfirmationRepository.findById(loanId).orElseThrow(()->new Exception("No confirmation with id:"+loanId));
		updateToConfirmation.setLoanStatus(loanConfirmation.getLoanStatus());
		updateToConfirmation.setLoanLimit(loanConfirmation.getLoanLimit());
		loanConfirmationRepository.save(updateToConfirmation);
		LoanConfirmation updatedConfirmation=loanConfirmationRepository.save(updateToConfirmation);
		return ResponseEntity.ok(updatedConfirmation);
	}

}
