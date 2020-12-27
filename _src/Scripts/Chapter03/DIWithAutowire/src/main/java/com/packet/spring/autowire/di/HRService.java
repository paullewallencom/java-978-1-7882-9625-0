package com.packet.spring.autowire.di;

public class HRService {
	private EmailService emailService = null;
	
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}
	
	public void initiateSeparation() {
		//Business logic for sepration process
		System.out.println(emailService);
		if(emailService !=null) {
			emailService.sendEmail();
		}
	}
}
