package com.packet.spring.javaconfig.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Professor {
	private String name;
	//Constructor
	public Professor() {
		System.out.println("Object of Professor is created");
	}
	public String getName() {
		return this.name;
	}
	@Autowired 
	public void setName(@Value("Komal") String name) {
		this.name = name;
	}
}
