package com.morgan.springIoCandDIdemo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.morgan.springIoCandDIdemo.config.SpringConfig;
import com.morgan.springIoCandDIdemo.domain.Account;
import com.morgan.springIoCandDIdemo.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTestCase {
	@Autowired
	private AccountService accountService;

	@Test
	public void testTransfer(){
		accountService.transfer("aaa", "bbb", 200.0);
	
	}

	
}
