package com.morgan.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.morgan.exception.BusinessException;
import com.morgan.exception.SystemException;

@RestControllerAdvice
public class ProjectException {

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
        // record log
        // send msg to ops engineer
        // send email to develop engineer
        return new Result(ex.getCode(),null,ex.getMessage());
    }
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){
        // record log
        // send msg to ops engineer
        // send email to develop engineer
        return new Result(Code.SYSTEM_UNKNOWN_ERR,null,"system error");
    }
}
