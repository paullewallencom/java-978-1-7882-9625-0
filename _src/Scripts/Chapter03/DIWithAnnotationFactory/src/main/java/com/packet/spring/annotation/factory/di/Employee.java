package com.packet.spring.annotation.factory.di;

public class Employee {
	private String type;
	public Employee(String type) {
		this.type = type;
	}
	public void showType() {
		System.out.println("Type is :"+type);
	}
}
