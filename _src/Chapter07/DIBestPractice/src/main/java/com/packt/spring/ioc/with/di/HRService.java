package com.packt.spring.ioc.with.di;
public class HRService {
	public int getLeaveInGivenMonth(int monthNo) {
		System.out.println(" getting no of leaves for month "+monthNo);
		return 2; // just for demo purpose.
	}
}
