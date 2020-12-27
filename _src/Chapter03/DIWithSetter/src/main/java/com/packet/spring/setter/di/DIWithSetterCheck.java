package com.packet.spring.setter.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DIWithSetterCheck {

	public static void main(String[] args) {

		ApplicationContext springContext =  new ClassPathXmlApplicationContext("application-context.xml");
		DocumentBase docBase = (DocumentBase) springContext.getBean("docBase");
		docBase.performSearch();
		docBase.displayBuildNo();
	}

}
