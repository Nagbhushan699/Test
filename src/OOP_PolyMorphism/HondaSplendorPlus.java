package OOP_PolyMorphism;

public class HondaSplendorPlus extends Honda{
	Double engineNo=3695.36;
	String color="Blue";
	public void kickStart() {
		System.out.println("Bike can be start by kick only");
	}
	public void selfStart() {
		System.out.println("Bike can start by self also");
	}

	public static void main(String[] args) {
	HondaSplendorPlus obj=new HondaSplendorPlus();
	System.out.println("Engine number hondasplenor "+obj.engineNo);
	System.out.println("color honda "+obj.color);
	obj.kickStart();
	obj.selfStart();
	System.out.println("Engine number honda "+Honda.engineNo);
	
	}

}
