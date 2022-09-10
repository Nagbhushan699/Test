package Practise12;

public class NSM {
	int a;
	static int b;
	static void m1() {
		NSM obj=new NSM();
		obj.a=5200;
		b=50;
		System.out.println(b);
		System.out.println(obj.a);
	}

	public static void main(String[] args) {
		NSM ob=new NSM();
		ob.m1();

	}

}
