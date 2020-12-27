package com.packt.spring.circulardependency.model.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.packt.spring.circulardependency.model.lazy.CommonUtilService;

@Component("hrService")
public class HRService {

	private CommonUtilService commonUtilService;
	
	public HRService(@Lazy CommonUtilService commonUtilService) {
		System.out.println(" CommonUtilService dependency is set ");
		this.commonUtilService=commonUtilService;
	}
	
}
