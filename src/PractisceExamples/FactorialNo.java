package PractisceExamples;

public class FactorialNo {
	public void factorial(int a) {
		int x=1;
		for(int i=1;i<=a;i++) {
			x=i*x;
		}
		System.out.println("Factorial of "+a+" is "+x);
	}

	public static void main(String[] args) {
		FactorialNo obj=new FactorialNo();
//		obj.factorial(5);
//        int a=6;
//        int x=1;
//        for(int i=1;i<=a;i++) {
//        	x=i*x;
//        }
//        System.out.println("Factorail of "+a + " is "+x);
		int a=7;
		int x=1;
		for(int i=1;i<=7;i++) {
			x=i*x;
		}
		System.out.println("Factorial of no : "+a +" is "+x);
	}

}
