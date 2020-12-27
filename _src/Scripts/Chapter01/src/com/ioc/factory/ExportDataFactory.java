package com.ioc.factory;


public class ExportDataFactory {

	public static IExportData getExportData(String type){
		IExportData exportData = null;
		if("TO_HTML".equalsIgnoreCase(type)){
			exportData = new ExportHTML();
		}else if("TO_PDF".equalsIgnoreCase(type)){
			exportData = new ExportPDF();
		}else {
			return null;
		}
		return exportData;
	}
}
