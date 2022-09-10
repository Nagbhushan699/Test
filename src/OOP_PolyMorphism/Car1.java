package OOP_PolyMorphism;

public class Car1 extends Vehicle {
	@Override
	 void start() {
	    	System.out.println("car start..");
	    }
	@Override
	    void stop() {
	    	System.out.println("car stop ");
	    }
   void showSpeed() {
	   System.out.println("speed is 40 km/hr");
   }

}
