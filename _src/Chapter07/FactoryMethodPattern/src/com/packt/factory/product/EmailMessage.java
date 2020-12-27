package com.packt.factory.product;

public class EmailMessage implements MessageApp {

	@Override
	public void sendMessage(String message) {
		//Mail specific implementation
		System.out.println("Sending  eMail message ...."+message);
	}
}
