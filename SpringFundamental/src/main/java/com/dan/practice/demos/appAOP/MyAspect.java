package com.dan.practice.demos.appAOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class MyAspect {
//    Analogy: pointCut is class and joinPoint is a sort of instance.
//    @Before("execution(void MyService.doSomething(..))")
//    @After("execution(void MyService.doSomething(..))")
//    public void intercept() {
//        System.out.println("Intercepted!");
//    }
    @Around("execution(void MyService.doSomething(..))")
    public void intercept(ProceedingJoinPoint joinPoint) throws Throwable {
//        joinPoint.proceed();
        System.out.println("Intercepted!" + Arrays.toString(joinPoint.getArgs()));
        Object[] args = joinPoint.getArgs();
        int actualValue = Integer.parseInt(args[0].toString());
        if (actualValue == 42) {
            joinPoint.proceed();
        } else {
            System.out.println("Ignoring.");
        }
    }
}
