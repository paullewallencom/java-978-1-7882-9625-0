package com.packt.spring.circulardependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.packt.spring.circulardependency.model.setter.CommonUtilService;
import com.packt.spring.circulardependency.model.setter.Employee;
import com.packt.spring.circulardependency.model.setter.HRService;

public class SpringCircularDependencySetterDemo {

	public static void main(String[] args) {
		
		/**
		 * Scenario 2: With setter there is no circular dependency
		 */
		ApplicationContext springContextForSetter = new AnnotationConfigApplicationContext(SpringConfigForSetter.class);
		
		Employee employee =  (Employee) springContextForSetter.getBean("employee");
		HRService hrService =  (HRService) springContextForSetter.getBean("hrService");
		CommonUtilService commonUtilService =  (CommonUtilService) springContextForSetter.getBean("commonUtilService");

	}

}
