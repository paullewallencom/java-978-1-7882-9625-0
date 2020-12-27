package com.packt.spring.ioc.without.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ServiceManager {
	private static ApplicationContext springContext =  new ClassPathXmlApplicationContext("application-context.xml");
	private ServiceManager() {
		
	}
	//This method will return the dependency 
	public static Object getDependentService(String serviceName) {
		Object dependency = null;
		if(springContext !=null) {
			dependency = springContext.getBean(serviceName);
		}
		return dependency;
	}
}
