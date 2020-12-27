package com.packt.spring.circulardependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.packt.spring.circulardependency.model.lazy.CommonUtilService;
import com.packt.spring.circulardependency.model.lazy.Employee;
import com.packt.spring.circulardependency.model.lazy.HRService;


public class SpringCircularDependencyLazyDemo {

	public static void main(String[] args) {

		/**
		 * Scenario 3: With Lazy annotation there is no circular dependency
		 */
		ApplicationContext springContextForSetter = new AnnotationConfigApplicationContext(SpringConfigForLazy.class);
		
		Employee employee =  (Employee) springContextForSetter.getBean("employee");
		HRService hrService =  (HRService) springContextForSetter.getBean("hrService");
		CommonUtilService commonUtilService =  (CommonUtilService) springContextForSetter.getBean("commonUtilService");

	}

}
