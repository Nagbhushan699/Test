package OOP_PolyMorphism;

public class Maruti800 extends Maruti {
	public Maruti800() {
		System.out.println("Car Brand : Maruti800");
	}
	public void speed() {
		System.out.println("Max Speed : 150 km/ph");
	}
	public void average() {
		System.out.println("Average : 70km per litre");
	}

	public static void main(String[] args) {
	  Maruti800 obj=new Maruti800();
	  obj.vehicleType();
	  obj.speed();
	  obj.average();
	  

	}

}
