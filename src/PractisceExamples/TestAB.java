package PractisceExamples;

public class TestAB {

	public static void main(String[] args) {
	B12 obj=new B12();
	obj.m1(); //m1 method is non-static method so compiler and jvm search this method in ref var class if available then execute
	//current object class //Bm1
	obj.m2(); // A12
	obj.m3();
	System.out.println(obj.a);//10
	System.out.println(obj.b);//30

	}
}
