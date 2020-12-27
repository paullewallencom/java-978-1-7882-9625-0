package com.packt.spring.ioc.without.di;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class IoCWithoutDICheck {
	public static void main(String[] args) {
		ApplicationContext springContext =  new ClassPathXmlApplicationContext("application-context.xml");
		EmployeeService employeeService = (EmployeeService) springContext.getBean("employeeService");
		employeeService.generateRewardPoints();
	}
}
