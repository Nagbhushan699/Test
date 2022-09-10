package Assignments;
// define a program to find out whether a given number is even or odd
public class methods_ex5 {
int a;
void show(int a)
{
	this.a=a;
	if(a%2==0)
	{
		System.out.println(a+ "  number is even");
	}
	else
	{
		System.out.println(a+"  number is odd");
	}
}
	public static void main(String[] args) {
		methods_ex5 obj=new methods_ex5();
		obj.show(7);

	}

}
