package Abstraction;

 abstract public class Car {
	static int wheels;
	String colour;
	int noOfGears;
	public void showCarInfo() {
	   wheels=4;
	   colour="Blue";
	   noOfGears=5;
	   System.out.println("Car Info");
	   System.out.println(wheels+"\sWheels");
	   System.out.println(colour+"\sColour");
	   System.out.println(noOfGears+"\sgears");
	}
	public abstract void start();
	public abstract void stop();
   public abstract void accelrate();
   public abstract void breaks();
}
