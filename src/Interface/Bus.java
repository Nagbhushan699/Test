package Interface;

public abstract class Bus implements Vehicle{
  public abstract void petrolEngine();
  public void milage() {
	  System.out.println("Milage is about 40km/ph");
  }
  public void getMaxSpeed() {
	  System.out.println("Maximum speed is 50km/ph");
  }
}
