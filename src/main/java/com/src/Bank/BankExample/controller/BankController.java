package com.src.Bank.BankExample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.src.Bank.BankExample.model.Bank;
import com.src.Bank.BankExample.service.BankService;
import com.src.Bank.BankExample.service.BankService;
import com.google.common.net.MediaType;

@RestController
@RequestMapping("/api")
public class BankController {

	@Autowired
	BankService service;

	@PostMapping(consumes = "application/json", produces = "application/json")
	public Bank createBank(@RequestBody Bank obj) {

		System.out.println("obj=" + obj.getBankname());
		return service.createBank(obj);
	}

	@GetMapping("/{Bankid}")
	public Bank getBankById(@PathVariable("Bankid") Integer bid) {
		System.out.println("Bankid=" + bid);
		return service.getBank(bid);
	}

	@PutMapping(consumes = "application/json")
	public Bank updateBank(@RequestBody Bank obj) {

		System.out.println("obj=" + obj.getBankname());
		return service.updateBank(obj);

	}

	@DeleteMapping("/{Bankid}")
	public String deleteBankById(@PathVariable("Bankid") Integer bid) {
		return service.deleteBank(bid);

	}


	@GetMapping(produces = "application/json")
	public List<Bank> getAllBanks() {

		return service.getAllBanks();
	}

	

}
