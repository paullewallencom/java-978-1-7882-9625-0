package com.packt.factory;

import com.packt.factory.product.MessageApp;

public abstract class MessagingService {

	//This is Factory method.
	public abstract MessageApp createMessageApp();
	
}
