package com.packet.spring.factory.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIWithInstanceFactoryCheck {

	public static void main(String[] args) {
		
		ApplicationContext springContext =  new ClassPathXmlApplicationContext("application-context.xml");
		SalaryService salaryService = (SalaryService)springContext.getBean("salaryService");
		salaryService.showEmployeeType();
	}
}
