package Interface;

public class RedBus extends Bus {
	public void engine() {
		System.out.println("RedBus----ENgine");
	}
	public void start() {
		System.out.println("RedBus----Start");
	}
	public void stop() {
		System.out.println("RedBus----Stop");
	}
	public  void petrolEngine() {
		System.out.println("RedBus-----PetrolEngine");
	}
	  @Override
	  public void milage() {
		  System.out.println("Milage is about 60km/ph");
	  }
	  @Override
	  public void getMaxSpeed() {
		  System.out.println("Maximum speed is 120km/ph");
	  }
}
