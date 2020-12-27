package com.packt.spring.aop.report;

public class UserSessionReport {

	public void totalLoggedInUser() {
		System.out.println("Total Logged in users ...");
	}
	
	public void totalLoggedInUserByRole(String role) {
		System.out.println("Total Logged in users with Role ..."+role);
	}
	
	public void averageLoggedInTime() {
		System.out.println("Everage logged in time ");
	}

}
