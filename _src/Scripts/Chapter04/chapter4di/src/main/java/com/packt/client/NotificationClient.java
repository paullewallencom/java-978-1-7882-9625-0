package com.packt.client;

import com.packt.services.NotificationService;
import com.packt.impl.SMSService;

public class NotificationClient {

	public static void main(String[] args) {
		
		NotificationService notificationService = new SMSService();
		notificationService.sendNotification("Hello", "1234567890");
	}
}
