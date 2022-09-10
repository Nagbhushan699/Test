package PractisceExamples;

public class Audi extends Car {
	static int wheels=6;
	String color;
	public  void showWheels(String color) {
		this.color=color;
		System.out.println("Audi Color is "+color);
		System.out.println("Audi have : "+wheels+" wheels");
	}
 public void autoOpenDoor() {
	 System.out.println("Audi-----AutoOpen Door");
 }
 public void dolbyMusicSystem() {
	 System.out.println("Audi-----DolbyMusicSystem");
 }
 @Override
 public void getSpeed() {
	 System.out.println("Audi-----speed 120 km/ph");
 }
 @Override
 public  void  getMilage() {
	 System.out.println("Audi-----Milage 60 km/ph");
 }
}
