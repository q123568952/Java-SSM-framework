package com.morgan.springIoCandDIdemo.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morgan.springIoCandDIdemo.dao.AccountDao;
import com.morgan.springIoCandDIdemo.domain.Account;
import com.morgan.springIoCandDIdemo.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountDao;


    @Override
    public void transfer(String out, String in, Double money) {
        accountDao.inMoney(in, money);
        accountDao.outMoney(out, money);
    }

 
    
}
