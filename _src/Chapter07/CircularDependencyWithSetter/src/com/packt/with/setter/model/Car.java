package com.packt.with.setter.model;

public class Car {

	private Tyre tyre;
	private int maxSpeed;

	//No dependency set in constructor
	public Car() {
		
	}
	
	//Dependency set through setter
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	public Tyre getTyre() {
		return tyre;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
