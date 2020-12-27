package com.packet.spring.autowire.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIAutoWireCheck {

	public static void main(String[] args) {
		
		ApplicationContext springContext =  new ClassPathXmlApplicationContext("application-context.xml");
		AccountService accountService = (AccountService)springContext.getBean("accountService");
		//accountService.processUserAccount();
		
		HRService hrService = (HRService)springContext.getBean("hrService");
		hrService.initiateSeparation();
	}
}
