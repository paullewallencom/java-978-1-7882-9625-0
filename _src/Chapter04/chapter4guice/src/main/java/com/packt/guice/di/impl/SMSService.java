package com.packt.guice.di.impl;

import javax.inject.Singleton;

import com.packt.guice.di.service.NotificationService;

@Singleton
public class SMSService implements NotificationService {

	public boolean sendNotification(String message, String recipient) {
		// Code to send SMS
		System.out.println("SMS has been sent to Recipient :: " + recipient + " with Message :: "+message);
		return true;
	}

}
