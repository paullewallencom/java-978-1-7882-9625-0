package com.packt.spring.ioc.with.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCWithDICheck {

	public static void main(String[] args) {
		
		ApplicationContext springContext =  new ClassPathXmlApplicationContext("application-context.xml");
		EmployeeService employeeService = (EmployeeService) springContext.getBean("employeeService1");
		employeeService.generateRewardPoints();
		
	}

}
