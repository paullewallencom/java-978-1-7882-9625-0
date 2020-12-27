package com.packt.spring.circulardependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.packt.spring.circulardependency.model.simple.CommonUtilService;
import com.packt.spring.circulardependency.model.simple.Employee;
import com.packt.spring.circulardependency.model.simple.HRService;


public class SpringCircularDependencyDemo {

	public static void main(String[] args) {

		/**
		 * Scenario 1: Example of circular Dependency
		 */
	    ApplicationContext springContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		Employee employee =  (Employee) springContext.getBean("employee");
		HRService hrService =  (HRService) springContext.getBean("hrService");
		CommonUtilService commonUtilService =  (CommonUtilService) springContext.getBean("commonUtilService");
	 
		
		//ApplicationContext springContext = new AnnotationConfigApplicationContext(SpringConfigForLazy.class);
		//ApplicationContext springContext = new AnnotationConfigApplicationContext(SpringConfigPostConstruct.class);
		//ApplicationContext springContext = new AnnotationConfigApplicationContext(SpringConfigDirectInject.class);
		
		
		/*Employee employee =  (Employee) springContext.getBean("employee");
		HRService hrService =  (HRService) springContext.getBean("hrService");
		CommonUtilService commonUtilService =  (CommonUtilService) springContext.getBean("commonUtilService");
*/		
	}

}
