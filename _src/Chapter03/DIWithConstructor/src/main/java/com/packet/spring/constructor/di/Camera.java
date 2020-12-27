package com.packet.spring.constructor.di;

public class Camera {
	
	private int resolution;
	private String mode;
	private boolean smileShot;
	private boolean flash;
	
	//Constructor.
	public Camera(int resolution, String mode, boolean smileShot, boolean flash) {
		this.resolution = resolution;
		this.mode = mode;
		this.smileShot = smileShot;
		this.flash = flash;
	}
	
	//Public method
	public void showSettings() {
		System.out.println("Resolution:"+resolution+"px mode:"+mode+" smileShot:"+smileShot);
		System.out.println("flash:"+flash);
	}

}
