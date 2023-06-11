package com.morgan.springIoCandDIdemo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {

    @Pointcut("execution(* com.morgan.springIoCandDIdemo.service.AccountService.*(..))")
    private void servicePt(){};

    @Around(value = "servicePt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable{
        Long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            pjp.proceed();
        }
        Long end = System.currentTimeMillis();
        Long spendTime = end-start;
        System.out.println(pjp.getSignature().getDeclaringTypeName()+"中的"+pjp.getSignature().getName() +"方法，執行花費時長為 " +spendTime+"ms");
    }
    
}
