package Harikrishna_Programs;

public class B15 extends A15 {
	void m1() {
		System.out.println("B15 m1");
	}
	void m3() {
		System.out.println("B15 m2");
		m1();
		super.m2();
	}
}
