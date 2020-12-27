package com.packt.spring.aop.report.impl;

import com.packt.spring.aop.report.api.IExportPaySlip;

public class ExportPDFPaySlip implements IExportPaySlip {

	@Override
	public void export() {
		System.out.println("Exporting payslip in PDF ...");

	}

}
