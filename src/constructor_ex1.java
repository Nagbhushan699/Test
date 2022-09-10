
public class constructor_ex1 {
	int x,y,z;
	constructor_ex1(int a,int b)
	{
		x=a;y=b;
		z=a+b;
		System.out.println("the sum of two numbers is :"+z);
	}
	constructor_ex1(constructor_ex1 ref)
	{
		x=ref.x;
		y=ref.y;
		z=x+y;
		System.out.println("the sum of two numbers is :"+z);
	}
	public static void main(String[] args) {
		constructor_ex1 obj=new constructor_ex1(10,20);
		constructor_ex1 ob=new constructor_ex1(obj);

	}

}
