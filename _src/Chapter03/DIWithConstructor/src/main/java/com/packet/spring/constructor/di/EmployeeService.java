package com.packet.spring.constructor.di;

public class EmployeeService {
	
	 private Logger log;
	 
	   //Constructor
	    public EmployeeService(Logger log) {
	        this.log = log;
	    }
	    
	    //Service method.
	    public void showEmployeeName() {
	    	log.info("showEmployeeName method is called ....");
	    	log.debug("This is Debuggin point");
	    	log.error("Some Exception occured here ...");
	    }

}
