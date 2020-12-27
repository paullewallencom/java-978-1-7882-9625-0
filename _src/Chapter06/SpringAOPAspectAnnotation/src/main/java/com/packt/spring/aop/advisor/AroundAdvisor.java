package com.packt.spring.aop.advisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println(" Around Advise called......  ");
		System.out.println("\n");
		System.out.println(" Just before method execution  ...");
		Object retValue = invocation.proceed();
		System.out.println(" After finishing method execution ...");
		return retValue;
	}
}
