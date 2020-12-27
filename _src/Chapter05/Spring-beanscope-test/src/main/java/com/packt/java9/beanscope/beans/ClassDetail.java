package com.packt.java9.beanscope.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

@Repository
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ClassDetail implements SessionBeanScope {

	/* Inject SingletonBeanScope to observer session scope behaviour */
	@Autowired
	SingletonBeanScope singletonBeanScope;

	/* Inject PrototypeBeanScope to observer prototype scope behaviour */
	@Autowired
	PrototypeBeanScope prototypeBeanScope;

	private static int increment = 0;

	/**
	 * Every time this bean is initialized, created variable will be increases by
	 * one.
	 */
	public ClassDetail() {
		System.out.println(" \n ::::::: Object of  ClassDetail bean with session scope created " + (++increment)
				+ " Times ::::::: ");
	}

	public void printClassDetail() {
		System.out.println("\n ::::::::: SessionBeanScope :: printClassDetail() Called ::::::::::::::: ");
	}
}
