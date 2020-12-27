package com.packet.spring.annotation.factory.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
	//Instance Factory method with annotation
	@Bean("developerBean")
	public Employee getEmployee(@Value("developer")String type) {
		Employee employee = null;
		if("developer".equalsIgnoreCase(type)) {
			employee = new Developer("developer");
		}else if("manager".equalsIgnoreCase(type)) {
			employee = new Manager("manager");
		}
		System.out.println("Employee of type "+type+" is created");
		return employee;
	}
}
