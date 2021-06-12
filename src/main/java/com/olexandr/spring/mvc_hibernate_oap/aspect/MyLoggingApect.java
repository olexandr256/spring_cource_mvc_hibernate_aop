package com.olexandr.spring.mvc_hibernate_oap.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.lang.reflect.Method;

@Component
@Aspect
public class MyLoggingApect {
    @Around("execution(* com.olexandr.spring.mvc_hibernate_oap.dao.*.*(..))")
    public Object aroundRepositoryMethodsAdvice(
            ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        MethodSignature methodSignature =
                (MethodSignature) proceedingJoinPoint.getSignature();
        String methodName = methodSignature.getName();
        System.out.println("Begin of "+methodName);

        Object targetMethodResult = proceedingJoinPoint.proceed();
        System.out.println("End of "+methodName);
        return targetMethodResult;
    }
}
