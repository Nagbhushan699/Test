package Assignments;
//WAP to print the factorial of a number by defining a method named factorial
//factorial of any number n is represent d by n! and is equal to 1*2*3...*(n-1)*n
public class methods_ex9 {
// int a;
// int x;
 public void factorial(int a)
 {
	 int x=1;
	 for(int i=1;i<=a;i++)
	 {
		x=i*x;
	 }
	 System.out.println("Factorial of "+a+" is: "+x);
 }
	public static void main(String[] args) {
		methods_ex9 obj=new methods_ex9();
		obj.factorial(5);

	}

}
