package Harikrishna_Programs;

public class Sample12 extends Example1{
void m1() {
	System.out.println("Sample m1");
}
public static void m2() {
	Example1.m2();
	System.out.println("Sample m1");
}

	public static void main(String[] args) {
	 Sample12 obj=new Sample12();
	 obj.m1();
	 obj.m2();
	 obj.m3();

	}

}
