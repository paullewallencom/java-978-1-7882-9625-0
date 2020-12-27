package com.packt.java9.beanscope.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packt.java9.beanscope.beans.PrototypeBeanScope;
import com.packt.java9.beanscope.beans.RequestBeanScope;
import com.packt.java9.beanscope.beans.SessionBeanScope;
import com.packt.java9.beanscope.beans.SingletonBeanScope;


@RestController
public class StudentController {

	public StudentController() {
		System.out.println(" ::::::::::::::::::::: StudentController Initialized :::::::::::::::: ");
	}

	@Autowired
	PrototypeBeanScope prototypeBeanScope;

	@Autowired
	SessionBeanScope sessionBeanScope;

	@Autowired
	RequestBeanScope requestBeanScope;

	@Autowired
	SingletonBeanScope singletonBeanScope;

	@RequestMapping("/")
	public String index() {
		sessionBeanScope.printClassDetail();
		requestBeanScope.printAddress();
		
		return " Greetings from Student Department !!";
	}

}
