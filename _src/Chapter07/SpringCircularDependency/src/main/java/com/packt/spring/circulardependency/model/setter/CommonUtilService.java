package com.packt.spring.circulardependency.model.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("commonUtilService")
public class CommonUtilService {

	private Employee employee;
	
	@Autowired
	public void setEmployee(Employee employee) {
		this.employee = employee;
		System.out.println(" Employee dependency is set ");
	}
}
