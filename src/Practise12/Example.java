package Practise12;

public class Example {
	static int a=50;
	int x;
//	static void m1() {
//		System.out.println("M1 start");
//		System.out.println("a : "+a);
//		//System.out.println("x : "+x);
//		Example e2=new Example();
//		System.out.println(e2.x);
//		System.out.println("M1  end :");
//	}
	void m2() {
		System.out.println(a);
		System.out.println("M1 start ");
		System.out.println("x : "+x);
		System.out.println("M1 end ");
	}

	public static void main(String[] args) {
		System.out.println(" a : "+a); //0
//		m1();  //0
//		System.out.println(" X  : "+x);
		Example e2=new Example();
		System.out.println("e2.x : "+e2.x);//0
		e2.m2();  //0
//		m1();   //

	}

}
