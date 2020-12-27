package com.packt.springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "application-context.xml" });
		
		// Retrieve emailService bean first time.
		EmailService emailServiceInstanceA = (EmailService) context.getBean("emailService");
		emailServiceInstanceA.setEmailContent("Hello, How are you?");
		emailServiceInstanceA.setToAddress("krunalpatel1410@yahoo.com");
		
		System.out.println("\n Email Content  : " + emailServiceInstanceA.getEmailContent() + " sent to  "+ emailServiceInstanceA.getToAddress() );

		// Retrieve emailService bean second time. 
		EmailService emailServiceInstanceB = (EmailService) context.getBean("emailService");
		System.out.println("\n Email Content  : " + emailServiceInstanceB.getEmailContent() + " sent to  "+ emailServiceInstanceB.getToAddress() );

	}

}
