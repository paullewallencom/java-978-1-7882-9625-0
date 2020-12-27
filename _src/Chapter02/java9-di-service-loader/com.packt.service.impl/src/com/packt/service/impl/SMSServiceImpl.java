package com.packt.service.impl;

import com.packt.service.api.NotificationService;

public class SMSServiceImpl implements NotificationService {

	public boolean sendNotification(String message, String recipient) {
		// Code to send SMS
		System.out.println("SMS has been sent to Recipient :: " + recipient + " with Message :: "+message);
		return true;
	}

}