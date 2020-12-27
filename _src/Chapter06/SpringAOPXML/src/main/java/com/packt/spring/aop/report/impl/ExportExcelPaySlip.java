package com.packt.spring.aop.report.impl;

import com.packt.spring.aop.report.api.IExportPaySlip;

public class ExportExcelPaySlip implements IExportPaySlip {

	@Override
	public void export() {
		System.out.println("Exporting payslip in Excel ...");

	}

}
