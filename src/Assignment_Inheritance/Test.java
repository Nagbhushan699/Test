package Assignment_Inheritance;



public class Test {

	public static void main(String []args) {
		BMW obj=new BMW();
		obj.getInfo();
		obj.getSubName();
		obj.getTechName();
		obj.vehicle();
		obj.getCarName1();
		System.out.println("---------------------");
		Audi obj1=new Audi();
		obj1.getInfo();
		obj1.getSubName();
		obj1.getTechName();
		obj1.vehicleName();
		obj1.getCarName2();
		obj1.remoteStart();
		System.out.println("*********************");
		Truck obj2=new Truck();
		obj2.getSubName();
		obj2.getTechName();
		obj2.vehicle();
		obj2.VehicleName();
	
		
	}

}
