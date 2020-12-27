package com.packt.java9.beanscope.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class StudentDetail implements SingletonBeanScope {

	/* Inject PrototypeBeanScope to observer prototype scope behaviour */
	@Autowired
	PrototypeBeanScope prototypeBeanScope;

	private static int increment = 0;

	/**
	 * Every time this bean is initialized, created variable will be increases by
	 * one.
	 */
	public StudentDetail() {
		super();
		System.out.println(" \n ::::::: Object of StudentDetail bean is created " + (++increment) + " times ::::::: ");
	}
}
