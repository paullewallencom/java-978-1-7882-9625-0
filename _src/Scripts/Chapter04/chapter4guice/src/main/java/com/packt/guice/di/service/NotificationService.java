package com.packt.guice.di.service;

public interface NotificationService {

	boolean sendNotification(String message, String recipient);
}
