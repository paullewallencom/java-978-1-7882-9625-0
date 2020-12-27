package com.packet.spring.factory.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIWithFactoryCheck {

	public static void main(String[] args) {
		
		ApplicationContext springContext =  new ClassPathXmlApplicationContext("application-context.xml");
		SearchableFactory searchableFactory = (SearchableFactory)springContext.getBean("searchableFactory");
		
		
	}

}
