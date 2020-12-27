package com.packt.strategy.demo;

import com.packt.strategy.algorithm.AmazoneS3Cloud;
import com.packt.strategy.algorithm.DropboxCloud;
import com.packt.strategy.algorithm.GoogleDriveCloud;
import com.packt.strategy.algorithm.OneDriveCloud;
import com.packt.strategy.context.CloudUpload;

public class StrategyDemo {

	public static void main(String[] args) {
		
		CloudUpload googleCloud = new CloudUpload(new GoogleDriveCloud());
		googleCloud.upload();
		
		CloudUpload dropBpxCloud = new CloudUpload(new DropboxCloud());
		dropBpxCloud.upload();
		
		CloudUpload oneDriveCloud = new CloudUpload(new OneDriveCloud());
		oneDriveCloud.upload();
		
		CloudUpload amazoneS3Cloud = new CloudUpload(new AmazoneS3Cloud());
		amazoneS3Cloud.upload();

	}

}
