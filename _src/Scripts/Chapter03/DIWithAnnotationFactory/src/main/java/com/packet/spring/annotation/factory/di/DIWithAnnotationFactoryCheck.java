package com.packet.spring.annotation.factory.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIWithAnnotationFactoryCheck {
	public static void main(String[] args) {
		ApplicationContext springContext =  new ClassPathXmlApplicationContext("application-context.xml");
		SalaryService salaryService = (SalaryService)springContext.getBean("salaryService");
		salaryService.showEmployeeType();
	}
}
