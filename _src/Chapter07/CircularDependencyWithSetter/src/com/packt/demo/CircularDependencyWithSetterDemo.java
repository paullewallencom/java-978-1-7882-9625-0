package com.packt.demo;

import com.packt.with.setter.model.Car;
import com.packt.with.setter.model.Tyre;

public class CircularDependencyWithSetterDemo {

	public static void main(String[] args) {
		Car car = new Car();
		car.setMaxSpeed(120);
	    Tyre tyre = new Tyre(car);
	    
	    car.setMaxSpeed(90);
	    tyre = new Tyre(car);
	}

}
