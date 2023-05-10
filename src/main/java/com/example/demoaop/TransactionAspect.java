package com.example.demoaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TransactionAspect {

    @Pointcut("execution(* Message.operations(int))")
    public void method(){}

    @Around("method()")
    public void aroundAspect(ProceedingJoinPoint joinPoint) {
        System.out.println("Transaction starts");
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("Something went wrong. Transaction rollback");
        }
        System.out.println("Transaction ends");
    }


}
