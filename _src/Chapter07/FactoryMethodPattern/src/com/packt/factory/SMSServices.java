package com.packt.factory;

import com.packt.factory.product.MessageApp;
import com.packt.factory.product.SMSMessage;

public class SMSServices extends MessagingService {
	
	@Override
	public MessageApp createMessageApp() {
		return new SMSMessage();
	}

}
