package com.packt.spring.aop.service;

public class HRService {
	
	public String showHolidayList() {
		System.out.println("This is holiday list method...");
		return "holidayList";
	}

	public void showMyLeave() throws Exception {
		System.out.println("Showing employee leaves...");
		throw new Exception();
	}
}
