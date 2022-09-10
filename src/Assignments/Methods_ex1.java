package Assignments;
//WAP to print the sum of two numbers entered by user by defining your own method
public class Methods_ex1 {
int a;
int b;
int x;
public void sum (int a, int b)
{
	this.a=a;
	this.b=b;
	x=a+b;
	System.out.println("the sum of two numbers : "+x);
}
	public static void main(String[] args) {
		Methods_ex1 obj=new Methods_ex1();
		obj.sum(10, 20);
	}

}
