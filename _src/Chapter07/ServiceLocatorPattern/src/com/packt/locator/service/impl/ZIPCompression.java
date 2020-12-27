package com.packt.locator.service.impl;

import com.packt.locator.service.CompressionAlgorithm;

public class ZIPCompression implements CompressionAlgorithm {

	@Override
	public void doCompress() {
		System.out.println(" Compressing in ZIP format ... ");
	}

}
