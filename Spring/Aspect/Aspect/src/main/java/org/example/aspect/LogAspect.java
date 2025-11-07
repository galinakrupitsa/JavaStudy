package org.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Before("execution(* org.example.aspect.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("начинается выполнение метода " + joinPoint.getSignature().getName());
    }

    @After("execution(* org.example.aspect.*.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("метод " + joinPoint.getSignature().getName() + " выполнен");
    }
}
