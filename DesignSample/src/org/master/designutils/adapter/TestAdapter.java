package org.master.designutils.adapter;

public class TestAdapter {

	public static void main(String[] args) {
	 Vehicle bus = new Bus();
	 Vehicle car = new Car();
	 Vehicle bicycle = new BicycleAdapter(new Bicycle());
	 
	 bus.accelerate();
	 car.accelerate();
	 bicycle.accelerate();
	}

}
