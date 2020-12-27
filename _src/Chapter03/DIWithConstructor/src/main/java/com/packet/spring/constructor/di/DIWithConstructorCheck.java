package com.packet.spring.constructor.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIWithConstructorCheck {

	public static void main(String[] args) {
		
		ApplicationContext springContext =  new ClassPathXmlApplicationContext("application-context.xml");
		EmployeeService employeeService = (EmployeeService) springContext.getBean("employeeService");
		Camera camera = (Camera)springContext.getBean("camera");
		employeeService.showEmployeeName();
		
		camera.showSettings();

	}

}
