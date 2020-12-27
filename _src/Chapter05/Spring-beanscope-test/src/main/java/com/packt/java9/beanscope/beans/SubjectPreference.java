package com.packt.java9.beanscope.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SubjectPreference implements PrototypeBeanScope {

	private static int increment = 0;

	/**
	 * Every time this bean is initialized, created variable will be increases by
	 * one.
	 */
	public SubjectPreference() {
		System.out.println(" \n ::::::: Object of SubjectPreference with Prototype scope is created " + (++increment)
				+ " Times  ::::::: \n ");
	}

}
