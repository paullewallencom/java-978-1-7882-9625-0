package com.packt.guice.di.injector;

import com.google.inject.AbstractModule;
import com.packt.guice.di.impl.SMSService;
import com.packt.guice.di.service.NotificationService;


public class ApplicationModule extends AbstractModule{

	@Override
	protected void configure() {
		//bind service to implementation class
		bind(NotificationService.class).to(SMSService.class);
	}

}
