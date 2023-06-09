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
    public void save(Account account) {
        accountDao.save(account);
    }

    @Override
    public void update(Account account) {
        accountDao.update(account);
    }

    @Override
    public void delete(Integer id) {
        accountDao.delete(id); ;
    }

    @Override
    public Account findById(Integer id) {
    Account ac = accountDao.findById(id);
    return ac;
    }

    @Override
    public List<Account> findAll() {
        List<Account> lsac =accountDao.findAll();
        return lsac;

    }

 
    
}
