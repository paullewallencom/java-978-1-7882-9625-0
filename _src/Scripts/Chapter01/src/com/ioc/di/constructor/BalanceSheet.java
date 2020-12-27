package com.ioc.di.constructor;

import java.util.List;

import com.ioc.di.IExportData;
import com.ioc.di.IFetchData;

public class BalanceSheet {

	private IExportData exportDataObj= null;
	private IFetchData fetchDataObj= null;

	//All dependencies are injected from client's constructor 
	BalanceSheet(IFetchData fetchData, IExportData exportData){
		this.fetchDataObj = fetchData;
		this.exportDataObj = exportData;
	}

	public Object generateBalanceSheet(){
		List<Object[]> dataLst = fetchDataObj.fetchData();
		return exportDataObj.exportData(dataLst);
	}
}
