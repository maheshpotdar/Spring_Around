package com.mahesh.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AroundAdvice {

	@Around("execution(public String getName())")
	public Object aroundAdviceExample(ProceedingJoinPoint joinPoint) {
		Object ob1 = null, ob2 = null;
		System.out.println("Before Advice  Called.");
		try {
			ob2 = joinPoint.proceed();
			ob1 = ob2;
			
		} catch (Throwable e) {
			System.out.println("Exception Catch Called." + e.getMessage());
		}
		System.out.println("After Advice Called.");
		return ob1;

	}

}
