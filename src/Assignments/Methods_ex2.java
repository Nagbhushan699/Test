package Assignments;
// define a method that returns the product of two numbers entered by user
public class Methods_ex2 {
int a,b,x;
int multi(int a,int b)
{
	this.a=a;
	this.b=b;
	x=a*b;
	return x;
}
	public static void main(String[] args) {
		Methods_ex2 obj=new Methods_ex2();
		int pro=obj.multi(10, 20);
        System.out.println("the product of two numbers : "+ pro);
	}

}
