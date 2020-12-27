package com.ioc.di.setter;

import java.util.List;

import com.ioc.di.IExportData;
import com.ioc.di.IFetchData;

public class BalanceSheet {

	private IExportData exportDataObj= null;
	private IFetchData fetchDataObj= null;

	//Setter injection for Export Data 
	public void setExportDataObj(IExportData exportDataObj) {
		this.exportDataObj = exportDataObj;
	}

	//Setter injection for Fetch Data
	public void setFetchDataObj(IFetchData fetchDataObj) {
		this.fetchDataObj = fetchDataObj;
	}

	public Object generateBalanceSheet(){

		List<Object[]> dataLst = fetchDataObj.fetchData();
		return exportDataObj.exportData(dataLst);
	}
}
