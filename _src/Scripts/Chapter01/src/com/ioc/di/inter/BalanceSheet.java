package com.ioc.di.inter;

import java.util.List;

import com.ioc.di.IExportData;
import com.ioc.di.IFetchData;

public class BalanceSheet implements IFetchAndExport {

	private IExportData exportDataObj= null;
	private IFetchData fetchDataObj= null;

	//Implements the method of interface injection to set dependency
	@Override
	public void setFetchData(IFetchData fetchData) {
		this.fetchDataObj = fetchData;
	}

	//Implements the method of interface injection to set dependency
	@Override
	public void setExportData(IExportData exportData) {
		this.exportDataObj = exportData;

	}

	public Object generateBalanceSheet(){
		List<Object[]> dataLst = fetchDataObj.fetchData();
		return exportDataObj.exportData(dataLst);
	}
}
