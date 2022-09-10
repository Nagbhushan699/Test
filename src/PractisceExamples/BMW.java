package PractisceExamples;

public class BMW extends Car {
 static int wheels=4;
 public static void showWheels() {
	 System.out.println("BMW have : "+wheels+" wheels");
 }
 public void autoParking() {
	 System.out.println("BMW ==== Autoparking");
 }
 public void remoteControl() {
	 System.out.println("BMW ==== remoteControl");
 }
 @Override
 public  void getSpeed() {
	 System.out.println("BMW----speed 40km/ph");
 }
 @Override
 public void  getMilage() {
	 System.out.println("BMW----milage 40km/ph");
 }
}
