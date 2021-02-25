package com.example.demo.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.entities.abstracts.IEntity;

@Entity
@Table(name="report")
public class Report implements IEntity {
	@Id
	@Column(name="rapor_id")
	private int raporId;
	@Column(name="daily_customer")
	private int dailyCustomer=0;
	
	
	
	public int getRaporId() {
		return raporId;
	}
	public void setRaporId(int raporId) {
		this.raporId = raporId;
	}
	public int getDailyCustomer() {
		return dailyCustomer;
	}
	public void setDailyCustomer(int dailyCustomer) {
		this.dailyCustomer = dailyCustomer;
	}
	

}
