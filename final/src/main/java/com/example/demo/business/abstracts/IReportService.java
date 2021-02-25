package com.example.demo.business.abstracts;

import com.example.demo.entities.concretes.Customer;
import com.example.demo.entities.concretes.Report;

public interface IReportService {
	public Report addReport(Report report,Customer customer);

}
