package com.packet.spring.constructor.di;

public class Logger {
	
	public void info(String msg){
       System.out.println("Logger INFO: "+msg);
    }
	
	public void debug(String msg){
    	System.out.println("Logger DEBUG: "+msg);
    }
	
    public void error(String msg){
    	System.out.println("Logger ERROR: "+msg);
    }
}
