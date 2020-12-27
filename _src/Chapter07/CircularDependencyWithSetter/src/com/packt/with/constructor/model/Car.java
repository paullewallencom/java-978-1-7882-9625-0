package com.packt.with.constructor.model;

public class Car {

	private Tyre tyre;
	private int maxSpeed;

	public Car(Tyre tyre) {
		this.tyre = tyre;
		setMaxSpeed(150);
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
