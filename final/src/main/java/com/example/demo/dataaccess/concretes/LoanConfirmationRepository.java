package com.example.demo.dataaccess.concretes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.concretes.LoanConfirmation;

public interface LoanConfirmationRepository extends JpaRepository<LoanConfirmation,Integer>{

}
