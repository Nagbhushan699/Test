package OOP_PolyMorphism;

public class TestCar {

	public static void main(String[] args) {
		BMW obj=new BMW();
		obj.vehicleEngine();
		obj.start();  //overriden method
        obj.showSpeed();
        System.out.println("----------------");
        Vehicle obj1=new Vehicle();
        obj1.start();
        obj1.vehicleEngine();
        
        System.out.println("----------------");
        Vehicle v1=new BMW();
        v1.start();
        v1.stop();
        v1.vehicleEngine();
        System.out.println("----------------");
        Car1 ob=new BMW();
        ob.start();
        obj.stop();
        ob.showSpeed();
        ob.autoparking();//not allowed
        System.out.println("----------------");
        
        
        
	}

}
