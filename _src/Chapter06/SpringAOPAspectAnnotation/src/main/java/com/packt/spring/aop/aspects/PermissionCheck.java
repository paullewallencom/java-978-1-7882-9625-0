package com.packt.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PermissionCheck {

	@Pointcut("within(com.packt.spring.aop.report.*)")
	public void checkReportPermission() {
		
	}
}
