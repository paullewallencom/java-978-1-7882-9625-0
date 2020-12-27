package com.packt.factory.demo;

import com.packt.factory.MessagingFactory;
import com.packt.factory.product.MessageApp;
import com.packt.factory.util.MessageType;

public class Client {

	public static void main(String[] args) {
		MessagingFactory messagingFactory = new MessagingFactory();
		
		MessageApp smsApp = messagingFactory.getMessageApp(MessageType.SMSType);
		MessageApp emailApp = messagingFactory.getMessageApp(MessageType.EmailType);
		MessageApp whatsAppApp = messagingFactory.getMessageApp(MessageType.WhatsAppType);
		
		smsApp.sendMessage(" Hello ");
		emailApp.sendMessage(" this is test ");
		whatsAppApp.sendMessage(" Good Morning");

	}

}
