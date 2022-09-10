package PractisceExamples;

public class TestCar {

	public static void main(String[] args) {
		BMW obj1=new BMW();
		obj1.start();
		obj1.stop();
		obj1.getSpeed();
		obj1.getMilage();
	
		obj1.autoParking();
		obj1.remoteControl();
		BMW.showWheels();
		System.out.println("_______________________");
		Audi obj2=new Audi();
		obj2.start();
		obj2.stop();
		obj2.showWheels("Blue");
		obj2.autoOpenDoor();
		obj2.dolbyMusicSystem();
		obj2.getSpeed();
		obj2.getMilage();
		

	}

}
