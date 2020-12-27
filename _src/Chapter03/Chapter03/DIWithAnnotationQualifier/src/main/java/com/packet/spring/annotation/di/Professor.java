package com.packet.spring.annotation.di;

public class Professor {
	private String name;
	//Constructor
	public Professor() {
		System.out.println("Object of Professor is created");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
