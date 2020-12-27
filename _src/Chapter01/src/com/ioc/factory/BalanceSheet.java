package com.ioc.factory;

import java.util.List;

public class BalanceSheet {

	private IExportData exportDataObj= null;
	private IFetchData fetchDataObj= null;

	public void configureFetchData(String type){
		this.fetchDataObj = FetchDataFactory.getFetchData(type);
	}
	//Set the export data object from outside of this class.
	public void configureExportData(IExportData actualExportDataObj){
		this.exportDataObj = actualExportDataObj;
	}

	public Object generateBalanceSheet(){
		List<Object[]> dataLst = fetchDataObj.fetchData();
		return exportDataObj.exportData(dataLst);
	}
}
