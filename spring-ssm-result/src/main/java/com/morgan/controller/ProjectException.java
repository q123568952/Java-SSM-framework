package com.morgan.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectException {

    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){
        return new Result(666,null,"error~~~~~");
    }
}
