package ConsturctorProblems;

public class B4 extends A4 {
// static void m1() {
//	System.out.println(super.a);
//	System.out.println(super.x);
//}
 void m2() {
	 System.out.println(super.a);
	 System.out.println(super.x);
 }
 @Override
 void m1() {
		System.out.println("My class B");
		super.m1();
	}
}
