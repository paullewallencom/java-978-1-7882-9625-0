package com.packt.locator.service.impl;

import com.packt.locator.service.EncryptionAlgorithm;

public class RSAEncrption implements EncryptionAlgorithm{

	@Override
	public void doEncryption() {
		System.out.println(" Encrypting with alogorithm RSA ... ");
	}

}
