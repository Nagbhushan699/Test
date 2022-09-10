package OOP_PolyMorphism;

public class BMW extends Car1{
	@Override
	 void start() {
	    	System.out.println("BMW start..");
	    }
	@Override
	    void stop() {
	    	System.out.println("BMW stop ");
	    }
  void autoparking() {
	   System.out.println("BMW autoparking");
  }

}
