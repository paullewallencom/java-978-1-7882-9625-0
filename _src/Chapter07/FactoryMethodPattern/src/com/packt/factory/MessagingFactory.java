package com.packt.factory;

import com.packt.factory.product.MessageApp;
import com.packt.factory.util.MessageType;

public class MessagingFactory {

	public MessageApp getMessageApp(MessageType messageType) {
		MessageApp messageApp = null;
		
		// 1.Based on messageType value, create concrete implementation.
		// 2.Call factory method on each of them to get abstract product type - MessageApp in our case
		// 3.call common method on abstract product type to execute desire operation.
		
		switch(messageType) {
		case SMSType:
			messageApp = new SMSServices().createMessageApp();
			break;
		case EmailType:
			messageApp = new EmailServices().createMessageApp();
			break;
		case WhatsAppType:
			messageApp = new WhatsAppServices().createMessageApp();
			break;
		default: System.out.println(" Unknown message type .. Please provide valid message type ");	
		}
		return messageApp;
	}
}
