package com.packt.spring.circulardependency.model.simple;

import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {

	private HRService hrService;
	
	public Employee(HRService hrService) {
		this.hrService=hrService;
	}
}
