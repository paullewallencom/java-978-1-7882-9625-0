package com.packet.spring.autowire.di;

public class AccountService {
	private UserService userService=null;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	//Setter DI method.
	public void processUserAccount() {
		if(userService !=null) {
			userService.getUserDetail();
		}
	}
}
