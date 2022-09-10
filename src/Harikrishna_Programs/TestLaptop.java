package Harikrishna_Programs;

public class TestLaptop {

	public static void main(String[] args) {
		Laptop karan= new Laptop();
		karan.getLaptopInfo("Hp", 4, 12);
		Laptop vaibhav= new Laptop();
		vaibhav.getLaptopInfo("Lenovo", 6, 10);
		Laptop.showConfiguration();
	}

}
