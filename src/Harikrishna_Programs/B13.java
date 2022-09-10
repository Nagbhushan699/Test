package Harikrishna_Programs;

public class B13 extends A13 {
public static void m1() {
	System.out.println("B m1");
}
	public static void main(String[] args) {
		B13 b=new B13();
		b.m1(); b.m2();  //B m1 A m2 A m1
		A13 ob=new B13();
		ob.m1(); ob.m2(); //A m1 
	}

}
