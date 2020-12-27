package com.packt.factory;

import com.packt.factory.product.MessageApp;
import com.packt.factory.product.WhatsAppMessage;

public class WhatsAppServices extends MessagingService {

	@Override
	public MessageApp createMessageApp() {
		return new WhatsAppMessage();
	}

}
