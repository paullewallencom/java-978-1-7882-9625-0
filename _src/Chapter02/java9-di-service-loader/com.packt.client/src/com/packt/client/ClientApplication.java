package com.packt.client;

import java.util.List;

import com.packt.service.api.NotificationService;

public class ClientApplication {

	public static void main(String[] args) {
		 List<NotificationService> notificationServices = NotificationService.getInstances();
	      for (NotificationService services : notificationServices) {
	    	  services.sendNotification("Hello", "1234567890");
	      }
	}

}
