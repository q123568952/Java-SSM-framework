package com.morgan.springIoCandDIdemo.service;

import java.io.IOException;

import org.springframework.transaction.annotation.Transactional;

public interface AccountService {

    @Transactional(rollbackFor = {IOException.class})
    public void transfer(String out, String in, Double money);

}
