package com.example.demo.dataaccess.concretes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.concretes.Report;

public interface ReportRepository extends JpaRepository<Report,Integer>{
	@Query(value="SELECT * FROM customers WHERE subscription_date > DATE_SUB(CURDATE(), INTERVAL 1 DAY",nativeQuery=true)
	List<Integer> findDailyCustomer();

}
