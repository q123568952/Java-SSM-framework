package com.morgan.springIoCandDIdemo.service;

import java.util.List;

import com.morgan.springIoCandDIdemo.domain.Account;

public interface AccountService {

    void save(Account account);
    void update(Account account);
   void delete(Integer id);
    Account findById(Integer id);
    List<Account> findAll();

}
