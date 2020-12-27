package com.packt.spring.aop.advisor;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LoggingAdvisor implements MethodBeforeAdvice  {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("****************** Starting  "+method.getName()+" method *****************");
	}
}
