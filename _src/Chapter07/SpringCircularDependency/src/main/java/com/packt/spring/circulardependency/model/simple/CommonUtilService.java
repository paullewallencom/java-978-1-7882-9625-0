package com.packt.spring.circulardependency.model.simple;

import org.springframework.stereotype.Component;

@Component("commonUtilService")
public class CommonUtilService {

	private Employee employee;
	
	public CommonUtilService(Employee employee) {
		this.employee = employee;
	}
}
