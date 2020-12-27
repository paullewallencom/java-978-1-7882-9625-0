package com.packt.impl;

import com.packt.services.NotificationService;

public class SMSService implements NotificationService {

	public boolean sendNotification(String message, String recipient) {
		// Code to send SMS Message
		System.out.println("SMS message has been sent to " + recipient);
		return true;
	}

}
