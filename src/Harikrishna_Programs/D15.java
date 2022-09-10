package Harikrishna_Programs;

public class D15 extends C15{

	void m1() {
		System.out.println("D15 m1");
	}
	void m2() {
		System.out.println("D15 m2");
		m1();
		super.m2();
	}
	void m4() {
		System.out.println("D m4");
	}
	public static void main(String []args) {
		D15 ib=new D15();
		ib.m1(); //D15
		ib.m2(); //D15 D15 m1 
		ib.m3();
		ib.m4();
	}

}
