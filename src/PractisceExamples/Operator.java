package PractisceExamples;

public class Operator {

	public static void main(String[] args) {
     int a=1;
     int b=20;
     int c=4;
     int d=0;
     if(a>b || (a>c)||(a>d)) {
    	 System.out.println("A is greatest");
     }
     else if(b>c) {
    	 System.out.println("B is greatest");
     }
     else {
    	 System.out.println("C is greatest");
     }

	}

}
