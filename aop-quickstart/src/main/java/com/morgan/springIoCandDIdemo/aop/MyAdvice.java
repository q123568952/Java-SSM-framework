package com.morgan.springIoCandDIdemo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void com.morgan.springIoCandDIdemo.dao.BookDao.update(..))")
    private void pt(){}
    @Pointcut("execution(int com.morgan.springIoCandDIdemo.dao.BookDao.select(..))")
    private void pt1(){}

    // @Before("pt()")
    public void before(){System.out.println("before advice");}

    // @After("pt()")
    public void after(){System.out.println("after advice");}

    @Around("pt1()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("around before advice");
        Object ret = pjp.proceed();
        System.out.println("around after advice");
        return ret;
    }

    public void afterReturning(){System.out.println("afterReturning advice");}

    public void afterThrowing(){System.out.println("afterThrowing advice");}
   
}
