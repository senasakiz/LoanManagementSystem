package com.example.demo.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.abstracts.IReportService;
import com.example.demo.entities.concretes.Customer;
import com.example.demo.entities.concretes.Report;

@RestController
@RequestMapping("/api/v1")
public class ReportsController {
	
	@Autowired
	IReportService reportService;
	
	@PostMapping("/report")
	public Report addReport(Report report,Customer customer) {
		return reportService.addReport(report,customer);
	}

}
