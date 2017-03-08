package com.infotech.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Account;
import com.infotech.service.impl.AccountServiceImpl;

public class ClientTest {

	public static void main(String[] args) {

		ApplicationContext ctx= new ClassPathXmlApplicationContext("Beans.xml");
		AccountServiceImpl accountService = ctx.getBean("accountService", AccountServiceImpl.class);
		
		accountService.updateAccountBalance(new Account("6778888886", "Money tranfer"), 3000L);
		((AbstractApplicationContext) ctx).close();
	}

}
