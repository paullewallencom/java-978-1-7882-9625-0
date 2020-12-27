package com.packt.spring.circulardependency.model.simple;

import org.springframework.stereotype.Component;

@Component("hrService")
public class HRService {

	private CommonUtilService commonUtilService;
	
	public HRService(CommonUtilService commonUtilService) {
		this.commonUtilService=commonUtilService;
	}
	
}
