package com.packt.locator.service.impl;

import com.packt.locator.service.CompressionAlgorithm;

public class RARCompression implements CompressionAlgorithm {

	@Override
	public void doCompress() {
		System.out.println(" Compressing in RAR format ... ");
	}

}
