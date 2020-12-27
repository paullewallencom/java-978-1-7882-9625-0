package com.packt.spring.circulardependency.model.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {

	private HRService hrService;
	
	@Autowired
	public void setHrService(HRService hrService) {
		this.hrService = hrService;
		System.out.println(" HRService dependency is set ");
	}
}
