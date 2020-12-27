package com.packt.template;

public abstract class ProcessData {

	//Template method
	public abstract void readFile(); 
	
	public void validate() {
		System.out.println(" Validating data ..");
	}
	
	public void format() {
		System.out.println(" Formatting data ..");
	}
	
	public void insertInDB() {
		System.out.println(" Inserting data into Database ..");
	}
}
