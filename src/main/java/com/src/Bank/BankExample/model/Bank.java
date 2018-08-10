package com.src.Bank.BankExample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
//@Table(name = "bank")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Bank {

	@Id
	@Column(name="Bankid")
	Integer Bankid;
	@Column(name="Bankname")
	String Bankname;
	public Integer getBankid() {
		return Bankid;
	}
	public void setBankid(Integer bankid) {
		Bankid = bankid;
	}
	public String getBankname() {
		return Bankname;
	}
	public void setBankname(String bankname) {
		Bankname = bankname;
	}

	
}
