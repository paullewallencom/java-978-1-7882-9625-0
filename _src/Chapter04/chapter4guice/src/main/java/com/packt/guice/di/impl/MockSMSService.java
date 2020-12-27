package com.packt.guice.di.impl;

import com.packt.guice.di.service.NotificationService;

public class MockSMSService implements NotificationService {

	public boolean sendNotification(String message, String recipient) {
		System.out.println("In Test Service :: " + message + "Recipient :: " + recipient);
		return true;
	}

}
