package com.example.demo.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.IReportService;
import com.example.demo.dataaccess.concretes.CustomerRepository;
import com.example.demo.dataaccess.concretes.ReportRepository;
import com.example.demo.entities.concretes.Customer;
import com.example.demo.entities.concretes.Report;

@Service
public class ReportManager implements IReportService{
	
	@Autowired
	private ReportRepository reportRepository;
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Report addReport(Report report,Customer customer) {
		int dailyCustomer=report.getDailyCustomer();
		LocalDate subscriptionDate=customer.getSubscriptionDate();
		LocalDate today=LocalDate.now();
		if(subscriptionDate==today) {
			dailyCustomer++;
			return reportRepository.save(report);
		}
		else {
			return report;
		}
		
	}

}
