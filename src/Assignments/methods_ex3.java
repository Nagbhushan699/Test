package Assignments;
//WAP to print the circumference and area of circle of radius entered by user
//by defining your own method.
public class methods_ex3 {
int r;
static double pi=3.14;
void circumference(int r)
{
	this.r=r;
	double x=2*pi*r;
	System.out.println("circumference of circle is : "+ x);
}
void area(int r)
{
	this.r=r;
	double x=pi*r*r;
	System.out.println("the area of circle is : "+ x);
}
	public static void main(String[] args) {
		methods_ex3 obj=new methods_ex3();
		obj.circumference(5);
        obj.area(5);
	}

	
}
