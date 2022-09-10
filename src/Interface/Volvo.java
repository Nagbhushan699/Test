package Interface;

public class Volvo extends Bus {
	public void engine() {
		System.out.println("Volvo------------Engine");
	}
	public void start() {
		System.out.println("Volvo------------Start");
	}
	public void stop() {
		System.out.println("Volvo------------Stop");
	}
	public void petrolEngine() {
		System.out.println("Volvo------------petrolEngine");
	}
	@Override
	  public void milage() {
		  System.out.println("Milage is about 70km/ph----Volvo");
	  }
	@Override
	  public void getMaxSpeed() {
		  System.out.println("Maximum speed is 150km/ph-----Volvo");
	  }
	public void disbreak() {
		System.out.println("Disbreak-----volvo");
	}
}
