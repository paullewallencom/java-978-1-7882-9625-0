package com.packet.spring.annotation.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Professor {
	//@Value(value="Nilang")
	private String name;
	//Constructor
	public Professor() {
		System.out.println("Object of Professor is created");
	}
	public String getName() {
		return name;
	}
	//Either you can set @Autowire and give primitive value with @Value or 
	// you can directly set @Value to respective property.
	@Autowired 
	public void setName(@Value("Komal") String name) {
		this.name = name;
	}
}
