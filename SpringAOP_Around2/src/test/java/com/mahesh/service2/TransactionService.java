package com.mahesh.service2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class TransactionService {

	@Around("execution(public void display())")
	public Object mymethod(ProceedingJoinPoint joinPoint) {
		Object object = null;
		try {

			System.out.println("before Advice");
			Object object1 = joinPoint.proceed();
			object = object1;
		} catch (Throwable e) {

			System.out.println("Advice  Exception Throw.");
		}
		System.out.println("After Advice");
		return object;
	}

}
