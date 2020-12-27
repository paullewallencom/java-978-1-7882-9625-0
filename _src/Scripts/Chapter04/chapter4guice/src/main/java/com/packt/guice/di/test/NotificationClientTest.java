package com.packt.guice.di.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.packt.guice.di.consumer.AppConsumer;
import com.packt.guice.di.impl.MockSMSService;
import com.packt.guice.di.service.NotificationService;

public class NotificationClientTest {
		private Injector injector;
		
		@Before
		public void setUp() throws Exception {
			injector = Guice.createInjector(new AbstractModule() {
				
				@Override
				protected void configure() {
					bind(NotificationService.class).to(MockSMSService.class);
				}
			});
		}
		
		@After
		public void tearDown() throws Exception {
			injector = null;
		}
		
		@Test
		public void test() {
			AppConsumer appTest = injector.getInstance(AppConsumer.class);
			Assert.assertEquals(true, appTest.sendNotification("Hello There", "9898989898"));;
		}
	
}

