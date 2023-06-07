package com.morgan.springIoCandDIdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.morgan.springIoCandDIdemo.config.SpringConfig;
import com.morgan.springIoCandDIdemo.service.AccountService;
import com.morgan.springIoCandDIdemo.service.impl.AccountServiceImpl;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		AccountServiceImpl accountService = ctx.getBean(AccountServiceImpl.class);
		System.out.println(accountService.findAll());
	}

}
