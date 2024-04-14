package com.jsp.banking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.banking.dto.accountDto;
import com.jsp.banking.repository.accountRepository;
import com.jsp.banking.service.accountService;

@Service
public class AccountServiceImpl implements accountService{
	private accountRepository accountRepository;
	
	@Autowired
	public AccountServiceImpl(com.jsp.banking.repository.accountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}

	@Override
	public accountDto createAccount(accountDto accountDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
