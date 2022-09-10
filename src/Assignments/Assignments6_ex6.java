package Assignments;
// In the below class, is 'method' overloaded or duplicated ?
public class Assignments6_ex6 {
 void method (int ...a)
 {
	 System.out.println(1);
 }
 void method(int [] a)
 {
	 System.out.println(2);
 }
	public static void main(String[] args) {
		Assignments6_ex6 obj=new Assignments6_ex6 ();
		
	}
// method is "duplicated".
}
