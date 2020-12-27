package com.packt.springbean;

public class EmailService {
	
	private String emailContent;
	private String toAddress;
	
	public EmailService() {
		System.out.print(" \n Object of EmailService is Created !!! ");
	}
	
	public String getEmailContent() {
		return emailContent;
	}
	
	public void setEmailContent(String emailContent) {
		this.emailContent = emailContent;
	}
	
	public String getToAddress() {
		return toAddress;
	}
	
	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}
	
	
}
