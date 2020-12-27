package com.packt.template.demo;

import com.packt.template.ProcessData;
import com.packt.template.impl.ProcessExcelData;
import com.packt.template.impl.ProcessHTMLData;

public class TemplateDemo {

	public static void main(String args[]) {
		
		ProcessData processData = new ProcessExcelData();
		processData.readFile();
		processData.validate();
		processData.format();
		processData.insertInDB();
		
		processData = new ProcessHTMLData();
		processData.readFile();
		processData.validate();
		processData.format();
		processData.insertInDB();
	}
}
