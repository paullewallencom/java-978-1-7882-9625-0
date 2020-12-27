package com.packt.factory;

import com.packt.factory.product.EmailMessage;
import com.packt.factory.product.MessageApp;

public class EmailServices extends MessagingService{

	@Override
	public MessageApp createMessageApp() {
		return new EmailMessage();
	}

}
