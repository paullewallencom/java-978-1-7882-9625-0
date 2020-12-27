package com.packt.spring.aop.aspects.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.packt.spring.aop.dao.SessionTrackerDao;
import com.packt.spring.aop.report.UserSessionReport;

public class SpringAOPWithAnnotationCheck {

	public static void main(String[] args) {
		ApplicationContext springContext =  new ClassPathXmlApplicationContext("application-context.xml");
		
		/* test advise with point-cut on bean with matching id or name*/
		//BatchOperationService batchOptService = (BatchOperationService)springContext.getBean("batchOperation");
		//batchOptService.importCSVFile();
		
		/* test advise with combine point-cut */
		UserSessionReport userSessionReport = (UserSessionReport)springContext.getBean("userSessionReport");
		userSessionReport.totalLoggedInUserByRole("EMPLOYEE");
		System.out.println("\n");
		
		/* Testing of logging advisor */
		SessionTrackerDao sessionTrackerDao = (SessionTrackerDao)springContext.getBean("sessionTrackerDao");
		sessionTrackerDao.updateLastLogin(2345L);
		
	}

}
