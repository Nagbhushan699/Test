package Practise12;

public class NestedIf {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=20;
	     if(a<b) {
		   if(a<c) {
			   System.out.println("a is small");
		   }
		   else {
			   System.out.println("a is smaller than b");
		   }
	   }
	   else {
		   if(b>c) {
			   System.out.println("b is larger");
		   }
		   else {
			   System.out.println("b is small");
		   }
			   
		   
	   }

	}

}
