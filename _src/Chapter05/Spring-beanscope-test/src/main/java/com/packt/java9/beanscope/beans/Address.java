package com.packt.java9.beanscope.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Address implements RequestBeanScope {

	private static int increment = 0;

	/* Inject PrototypeBeanScope to observer prototype scope behaviour */
	@Autowired
	PrototypeBeanScope prototypeBeanScope;

	/**
	 * Every time this bean is initialized, created variable will be increases by
	 * one.
	 */
	public Address() {
		System.out.println(
				" \n ::::::: Object of Address bean with Request scope created  " + (++increment) + " Times  ::::::: ");
	}

	public void printAddress() {
		System.out.println("\n :::::::::::::: RequestbeanScope :: printAddress() Called :::::::::::::: ");
	}
}
