package com.morgan.springIoCandDIdemo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.morgan.springIoCandDIdemo.config.SpringConfig;
import com.morgan.springIoCandDIdemo.service.impl.AccountServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes =SpringConfig.class)
public class AccountServiceTest {
    
    @Autowired
    private AccountServiceImpl accountService;
     @Test    
     public void testFindById(){
        System.out.println(accountService.findById(1));
     }
}
