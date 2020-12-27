package com.packt.spring.aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SessionCheck {

	@Pointcut("execution( * com.packt.spring.aop.service.*.*(..))")
	private void validateSession() {
		
	}
	
	@Pointcut("execution( * com.packt.spring.aop.report.*.*(..))")
	private void checkSession() {
		
	}
	@Pointcut("args(String)")
	private void printUserName() {
		
	}
	@Pointcut("checkSession() && printUserName()")
	private void userSession() {
		
	}
	
	@Pointcut("bean(batchOperation)")
	private void captureBatchProcess() {
		
	}
	
	@Pointcut("execution(* com.packt.spring.aop.dao.*.*(..))")
	public void manageSession() {
		
	}
	/* Before advise on bean with matching id or name */
	@Before("captureBatchProcess()")
	public void startLog() {
		System.out.println(" Batch is started ");
	}
	
	/* Before advise on join-point combination */
	@Before("userSession()")
	public void showUserName() {
		System.out.println(" Showing the user name of logged in user --");
	}
	
	@After("com.packt.spring.aop.aspects.PermissionCheck.checkReportPermission()")
	public void checkResourcePermission() {
		System.out.println("This is resource permission checker ..");
	}
}
