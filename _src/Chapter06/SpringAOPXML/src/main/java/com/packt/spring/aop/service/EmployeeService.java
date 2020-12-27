package com.packt.spring.aop.service;

public class EmployeeService {

	public void generateSalarySlip() {
		System.out.println("Generating payslip");
	}
	
	public String showTotalEmployee(String test) {
		System.out.println(" The string is -->"+test);
		return test;
	}
	
	public void findEmployee(String employeeId) {
		System.out.println(" finding employee based on employeeId ");
	}
}
