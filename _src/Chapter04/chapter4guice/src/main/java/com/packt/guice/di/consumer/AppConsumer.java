package com.packt.guice.di.consumer;

import javax.inject.Inject;

import com.packt.guice.di.service.NotificationService;


public class AppConsumer {

	private NotificationService notificationService;

	//Setter based DI
	@Inject
	public void setService(NotificationService service) {
		this.notificationService = service;
	}
	
	public boolean sendNotification(String message, String recipient){
		//Business logic
		return notificationService.sendNotification(message, recipient);
	}
}
