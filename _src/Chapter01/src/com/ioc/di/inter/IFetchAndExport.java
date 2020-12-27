package com.ioc.di.inter;

import com.ioc.di.IExportData;
import com.ioc.di.IFetchData;

public interface IFetchAndExport {

	void setFetchData(IFetchData fetchData);
	void setExportData(IExportData exportData);
}
