package com.packet.spring.setter.di;

public class DocumentBase {
	
	private String buildNo;
	private DocFinder docFinder;
	
	//Setter method to inject dependency.
	public void setDocFinder(DocFinder docFinder) {
		this.docFinder = docFinder;
	}
	
	//Primitive dependency
	public void setBuildNo(String buildNo) {
		this.buildNo = buildNo;
	}
	
	public void displayBuildNo() {
		System.out.println(" Document build is : "+buildNo);
	}
	
	public void performSearch() {
		this.docFinder.doFind();
	}
	
	

}
