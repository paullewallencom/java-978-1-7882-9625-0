package com.packt.spring.circulardependency.model.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hrService")
public class HRService {

	private CommonUtilService commonUtilService;
	
	@Autowired
	public void setCommonUtilService(CommonUtilService commonUtilService) {
		this.commonUtilService = commonUtilService;
		System.out.println(" CommonUtilService dependency is set ");
	}
}
