package com.infotech.service.impl;

import org.springframework.stereotype.Service;

import com.infotech.model.Account;

@Service("accountService")
public class AccountServiceImpl {

	public Account updateAccountBalance(Account account,Long amount){
		System.out.println("Account No:"+account.getAccountNumber()+", Amount:"+amount);
		return account;
	}
}
