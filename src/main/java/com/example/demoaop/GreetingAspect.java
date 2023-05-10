package com.example.demoaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class GreetingAspect {

    @Pointcut("execution(* Message.generateMessage(String))")
    public void method(){}

    @Before("method()")
    public void beforeAspect(){
        System.out.print("Hello! ");
    }


}
