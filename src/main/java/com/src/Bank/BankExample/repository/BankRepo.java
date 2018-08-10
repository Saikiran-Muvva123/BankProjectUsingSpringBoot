package com.src.Bank.BankExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.src.Bank.BankExample.model.Bank;

@Repository
public interface BankRepo extends JpaRepository<Bank, Integer> {

}
