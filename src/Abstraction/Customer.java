package Abstraction;

public class Customer extends Car {

	@Override
	public void start() {
		System.out.println("Car Start..");
	}
	@Override
	public void stop() {
		System.out.println("Car Stop..");
	}

	@Override
	public void accelrate() {
		System.out.println("Car accelrate..");
	}
	@Override
	public void breaks() {
	System.out.println("Car Breaks");	
	}

}
