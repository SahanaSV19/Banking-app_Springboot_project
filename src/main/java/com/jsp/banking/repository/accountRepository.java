package com.jsp.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.banking.entity.Account;

public interface accountRepository extends JpaRepository<Account, Long>{

}
