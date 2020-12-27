package com.packt.strategy.context;

import com.packt.strategy.algorithm.Cloud;

public class CloudUpload {
	
	private final Cloud cloud;
	public CloudUpload(Cloud cloud) {
		this.cloud = cloud;
	}
	
	public void upload() {
		this.cloud.upload();
	}
}
