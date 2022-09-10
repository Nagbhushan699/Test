package Assignments;

public class Bicycle {
 int gears=5;
 void breaking(int gears)
 {
	 System.out.println("CAR START");
 }
	public static void main(String[] args) {
		Bicycle obj=new Bicycle();
		obj.breaking(4);
		Bicycle obj1=new Bicycle();
		obj1.breaking(3);
		Bicycle obj2=new Bicycle();
		obj2.breaking(5);
	}

}
