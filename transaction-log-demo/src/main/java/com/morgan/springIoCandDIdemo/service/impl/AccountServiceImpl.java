package com.morgan.springIoCandDIdemo.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.morgan.springIoCandDIdemo.dao.AccountDao;
import com.morgan.springIoCandDIdemo.domain.Account;
import com.morgan.springIoCandDIdemo.service.AccountService;
import com.morgan.springIoCandDIdemo.service.LogService;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;

    
    @Override
    public void transfer(String out, String in, Double money) {

        try {
            accountDao.inMoney(in, money);
            accountDao.outMoney(out, money);
        } finally {
            logService.log(out, in, money);
        }
        
        
    }

 
    
}
