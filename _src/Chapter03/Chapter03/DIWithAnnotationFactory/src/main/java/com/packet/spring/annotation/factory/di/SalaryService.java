package com.packet.spring.annotation.factory.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SalaryService {
	private Employee employee;
	@Autowired
	public void setEmployee(@Qualifier("developerBean")Employee employee) {
		this.employee = employee;
	}
	public void showEmployeeType() {
		if(this.employee !=null) {
			this.employee.showType();
		}
	}
}
