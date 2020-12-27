package com.packt.factory.product;

public class SMSMessage implements MessageApp {

	@Override
	public void sendMessage(String message) {
		//SMS specific implementation.
		System.out.println("sending SMS message ..."+message);
	}

}
