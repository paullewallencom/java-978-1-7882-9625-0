package com.packt.locator.demo;

import com.packt.locator.ServiceLocator;
import com.packt.locator.service.CompressionAlgorithm;
import com.packt.locator.service.EncryptionAlgorithm;
import com.packt.locator.service.impl.AESEncrption;
import com.packt.locator.service.impl.RARCompression;
import com.packt.locator.service.impl.RSAEncrption;
import com.packt.locator.service.impl.ZIPCompression;

public class ServiceLocatorDemo {

	public static void main(String[] args) {
		
		ServiceLocator locator = ServiceLocator.getInstance();
		
		initializeAndRegisterServices(locator);
		
		CompressionAlgorithm rarCompression = locator.getSerivce(CompressionAlgorithm.class, "rar");
		rarCompression.doCompress();
		
		CompressionAlgorithm zipCompression = locator.getSerivce(CompressionAlgorithm.class, "zip");
		zipCompression.doCompress();
		
		EncryptionAlgorithm rsaEncryption = locator.getSerivce(EncryptionAlgorithm.class, "rsa");
		rsaEncryption.doEncryption();
		
		EncryptionAlgorithm aesEncryption = locator.getSerivce(EncryptionAlgorithm.class, "aes");
		aesEncryption.doEncryption();
		
		
	}
	
	
	private static void initializeAndRegisterServices( ServiceLocator locator ) {
		
		CompressionAlgorithm rarCompression = new RARCompression();
		CompressionAlgorithm zipCompression = new ZIPCompression();
		EncryptionAlgorithm rsaEncryption = new RSAEncrption();
		EncryptionAlgorithm aesEncryption = new AESEncrption();
		
		
		
		locator.registerService(CompressionAlgorithm.class, "rar", rarCompression);
		locator.registerService(CompressionAlgorithm.class, "zip", zipCompression);
		locator.registerService(EncryptionAlgorithm.class, "rsa", rsaEncryption);
		locator.registerService(EncryptionAlgorithm.class, "aes", aesEncryption);
	}

}
