package com.packt.spring.aop.aspects.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.packt.spring.aop.report.api.IExportPaySlip;
import com.packt.spring.aop.service.EmployeeService;
import com.packt.spring.aop.service.HRService;

public class SpringAOPInXMLCheck {

	public static void main(String[] args) {
		ApplicationContext springContext =  new ClassPathXmlApplicationContext("application-context.xml");
		EmployeeService employeeService = (EmployeeService)springContext.getBean("employeeService");
		HRService hrService = (HRService)springContext.getBean("hrService");
		employeeService.generateSalarySlip();
		employeeService.showTotalEmployee("test");
		employeeService.findEmployee("abc123");
		
		String retVal = hrService.showHolidayList();
		try {
			hrService.showMyLeave();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
