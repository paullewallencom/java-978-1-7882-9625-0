package com.packt.spring.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

	//Before advise method.
	public void printStartLog(JoinPoint joinPoint) {
		System.out.println(" ****** Starting Method '"+joinPoint.getSignature().getName()+"' of "+joinPoint.getTarget().getClass());
	}
	
	//After advise method.
	public void printEndLog(JoinPoint joinPoint) {
		System.out.println(" ****** End of Method '"+joinPoint.getSignature().getName());
	}
	
	//Around advise method.
	public void printAroundLog(ProceedingJoinPoint proceedingJointPoint) throws Throwable {
		System.out.println("----- Starting of Method "+proceedingJointPoint.getSignature().getName());
		proceedingJointPoint.proceed();
		System.out.println("----- ending of Method "+proceedingJointPoint.getSignature().getName());
	}
}
