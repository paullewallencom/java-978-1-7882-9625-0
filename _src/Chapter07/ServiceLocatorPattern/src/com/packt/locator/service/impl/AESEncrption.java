package com.packt.locator.service.impl;

import com.packt.locator.service.EncryptionAlgorithm;

public class AESEncrption implements EncryptionAlgorithm {

	@Override
	public void doEncryption() {
		System.out.println(" Encrypting with alogorithm AES ... ");
	}

}
