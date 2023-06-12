package com.morgan.springIoCandDIdemo.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        // int i = 1/0; 
        accountDao.outMoney(out, money);
    }

 
    
}
