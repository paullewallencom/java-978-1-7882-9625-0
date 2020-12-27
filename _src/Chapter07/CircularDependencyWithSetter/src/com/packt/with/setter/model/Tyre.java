package com.packt.with.setter.model;

public class Tyre {

	private Car car;
	private int minRimSize;

	public Tyre(Car car) {
		this.car = car;
		this.car.setTyre(this);

		if(this.car.getMaxSpeed()>100 && this.car.getMaxSpeed()<200) {
			System.out.println("Minimum RIM size is 15");
			setMinRimSize(15);
		}else if(this.car.getMaxSpeed()<100) {
			System.out.println("Minimum RIM size is 14");
			setMinRimSize(14);
		}

	}
	public int getMinRimSize() {
		return minRimSize;
	}
	public void setMinRimSize(int minRimSize) {
		this.minRimSize = minRimSize;
	}
}
