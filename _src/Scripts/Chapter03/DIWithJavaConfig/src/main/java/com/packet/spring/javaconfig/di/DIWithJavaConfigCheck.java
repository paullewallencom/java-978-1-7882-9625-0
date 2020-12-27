package com.packet.spring.javaconfig.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIWithJavaConfigCheck {
	public static void main(String[] args) {
		ApplicationContext springContext = new AnnotationConfigApplicationContext(JavaBaseSpringConfig.class);
		//Professor professor = (Professor)springContext.getBean("professor");
		Subject subject = (Subject)springContext.getBean("subjectBean");
		subject.taughtBy();
	}
}
