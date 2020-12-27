package com.packet.spring.factory.di;

public class SalaryService {
	
	private Employee employee;
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public void showEmployeeType() {
		if(this.employee !=null) {
			this.employee.showType();
		}
	}

}
