package Assignment_Inheritance;

public class BMW extends Car {
	@Override
	void vehicle() {
		System.out.println("This is vehicle");
	}
	@Override
	void vehicleName() {
		System.out.println("This is car ");
	}
	void getCarName1() {
		System.out.println("This is BMW Car");
	}
   void AutoStart() {
	   System.out.println("This car is autostarted");
   }
}
