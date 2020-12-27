package com.packt.spring.circulardependency.model.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.packt.spring.circulardependency.model.lazy.Employee;

@Component("commonUtilService")
public class CommonUtilService {

	private Employee employee;
	
	public CommonUtilService(@Lazy Employee employee) {
		System.out.println(" Employee dependency is set ");
		this.employee = employee;
	}
	
}
