package com.example.demo.business.concretes;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.ILoanService;
import com.example.demo.dataaccess.concretes.BlackListRepository;
import com.example.demo.dataaccess.concretes.LoanConfirmationRepository;
import com.example.demo.dataaccess.concretes.LoanRepository;
import com.example.demo.entities.concretes.BlackList;
import com.example.demo.entities.concretes.Loan;
import com.example.demo.entities.concretes.LoanConfirmation;

@Service
public class LoanManager implements ILoanService {
	
	@Autowired
	private LoanRepository loanRepository;
	
	@Autowired
	private BlackListRepository blackListRepository;
	
	@Autowired
	private LoanConfirmationRepository loanConfirmationRepository;

	@Override
	public List<Loan> getAll() {
		return loanRepository.findAll();
	}
	
	@Override
	public Optional<Loan> getById(Loan loan) {
		int loanId=loan.getLoanId();
		return loanRepository.findById(loanId);
	}

	@Override
	public Loan addLoan(Loan loan,LoanConfirmation loanConfirmation) throws Exception {
		int customerId=loan.getCustomerId();
		double billScore=loan.getBillScore();
		LocalDate date=loan.getSubscriptionDate();
		LocalDate today=LocalDate.now();
		List<Integer> blackList=blackListRepository.findBlackList(customerId);
		
		if(blackList.isEmpty()) {
			System.out.println("müşteri kara listede değil");
			
			if(date.isBefore(today.minusYears(10))&& billScore>2000) {
				System.out.println("kredi girişi kabul edildi onaya gitti. verilen limit 15.000 tl");
				loan.setLoanLimit(15000);
				loanConfirmation.setCustomerId(loan.getCustomerId());
				loanConfirmation.setBillScore(loan.getBillScore());
				loanConfirmation.setLoanLimit(loan.getLoanLimit());
				loanConfirmation.setSubscriptionDate(loan.getSubscriptionDate());
				loanConfirmationRepository.save(loanConfirmation);
				return loanRepository.save(loan);
			}
			
			else if(date.isBefore(today.minusYears(5))&& billScore>1000) {
				System.out.println("kredi girişi kabul edildi onaya gitti. verilen limit 5.000 tl");
				loan.setLoanLimit(5000);
				loanConfirmation.setCustomerId(loan.getCustomerId());
				loanConfirmation.setBillScore(loan.getBillScore());
				loanConfirmation.setLoanLimit(loan.getLoanLimit());
				loanConfirmation.setSubscriptionDate(loan.getSubscriptionDate());
				loanConfirmationRepository.save(loanConfirmation);
				return loanRepository.save(loan);
			}
			else {
				System.out.println("kredi şartlarına uygun değil");
				throw new IllegalArgumentException("kredi için abonelik süresi yeterli değil!");
			}
		}
		else {
			System.out.println("müşteri kara listede,kredi iptal");
			throw new IllegalArgumentException("müşteri kara listede");
		}
		
	}

}
