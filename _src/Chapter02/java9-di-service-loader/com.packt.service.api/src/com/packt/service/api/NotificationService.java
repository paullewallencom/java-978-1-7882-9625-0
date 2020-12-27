package com.packt.service.api;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public interface NotificationService {
	
	/* Loads all the service providers */
	public static List<NotificationService> getInstances() {
		ServiceLoader<NotificationService> services = ServiceLoader.load(NotificationService.class);
		List<NotificationService> list = new ArrayList<>();
		services.iterator().forEachRemaining(list::add);
		return list;
	}
	
	/* Send notification with provided message and recipient */
	boolean sendNotification(String message, String recipient);
	
}
