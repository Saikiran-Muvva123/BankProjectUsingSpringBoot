package com.src.Bank.BankExample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.Bank.BankExample.model.Bank;
import com.src.Bank.BankExample.repository.BankRepo;

@Service
public class BankService {

	@Autowired
	BankRepo brepo;

	@Transactional
	public Bank getBank(Integer Bankid) {
		return brepo.getOne(Bankid);
	}

	@Transactional
	public Bank createBank(Bank objBank) {
		return brepo.save(objBank);
	}

	@Transactional
	public String deleteBank(Integer Bankid) {
		brepo.deleteById(Bankid);
		return "Successfully deleted for id=" + Bankid;
	}

	@Transactional
	public Bank updateBank(Bank objBank) {
		return brepo.save(objBank);

	}
    
	@Transactional(readOnly=true)
	public List<Bank> getAllBanks() {

		return brepo.findAll();
	}

}
