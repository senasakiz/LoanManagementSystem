package com.example.demo.dataaccess.concretes;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.concretes.Loan;

public interface LoanRepository extends JpaRepository<Loan,Integer>{

}
