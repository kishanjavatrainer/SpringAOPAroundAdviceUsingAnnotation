package com.infotech.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AccountServiceAspect {

	@Around("execution(* com.infotech.service.impl.AccountServiceImpl.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint){
		System.out.println("Before method:"+joinPoint.getSignature().getName()+",Class:"+joinPoint.getTarget().getClass().getSimpleName());
		
		long sTime = System.currentTimeMillis();
		Object object= null;
		try {
			object=joinPoint.proceed();
		} catch (Throwable ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("After method:"+joinPoint.getSignature().getName()+",Class:"+joinPoint.getTarget().getClass().getSimpleName());
		long eTime = System.currentTimeMillis();
		
		System.out.println("Total execution time taken by Method:"+joinPoint.getSignature().getName() +" is :"+(eTime-sTime)+" ms");
		return object;
	}
}
