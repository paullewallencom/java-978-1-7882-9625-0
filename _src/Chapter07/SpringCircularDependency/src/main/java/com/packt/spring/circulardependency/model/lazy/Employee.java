package com.packt.spring.circulardependency.model.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.packt.spring.circulardependency.model.lazy.HRService;

@Component("employee")
public class Employee {

	private HRService hrService;
	
	public Employee(@Lazy HRService hrService) {
		System.out.println(" HRService dependency is set ");
		this.hrService=hrService;
	}
	
}
