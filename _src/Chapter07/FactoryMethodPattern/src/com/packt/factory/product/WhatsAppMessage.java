package com.packt.factory.product;

public class WhatsAppMessage implements MessageApp {

	@Override
	public void sendMessage(String message) {
		//Whatsapp specific implementation
		System.out.println("Sending Whatsapp message ..."+message);
	}

}
