package com.packt.guice.di.client;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.packt.guice.di.consumer.AppConsumer;
import com.packt.guice.di.injector.ApplicationModule;

public class NotificationClient {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new ApplicationModule());

		AppConsumer app = injector.getInstance(AppConsumer.class);

		app.sendNotification("Hello", "9999999999");
	}
}
