package com.packet.spring.annotation.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIAnnotationBasicCheck {
	public static void main(String[] args) {
		ApplicationContext springContext =  new ClassPathXmlApplicationContext("application-context.xml");
		Subject subject = (Subject)springContext.getBean("subject");
		subject.taughtBy();
	}
}
