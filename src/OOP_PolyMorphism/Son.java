package OOP_PolyMorphism;

public class Son extends Papa {
	String cycle="Atlas";
	void rideCycle() {
		System.out.println(" I ride bicycle");
	}

	public static void main(String[] args) {
		Son obj=new Son();
		System.out.println("I use my papa salary : "+obj.salary);
		System.out.println("I drive my papa car : "+obj.bike);
		System.out.println("I live in my papa home : "+obj.home);
		obj.driveCar();
		obj.rideCycle();
		
		System.out.println(obj.cycle);
	}

}
