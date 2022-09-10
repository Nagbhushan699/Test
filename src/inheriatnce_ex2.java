import java.util.Scanner;

public class inheriatnce_ex2 {
	int a,b,c;
	void add()
	{
		System.out.println("enter the two numbers");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		 c=a+b;
		System.out.println("the sum of two numbers is :"+c);
	}
}
class kar extends inheriatnce_ex2{
	void multiplication()
	{
		c=a*b;
		System.out.println("the multiplication of two numbers is :"+c);
	}
}
class rec extends kar{
	void div() {
		c=a/b;
		System.out.println("the division of two numbers is :"+c); 
	}

	public static void main(String[] args) {
	rec obj=new rec();
	obj.add();
	obj.multiplication();
	obj.div();

	}


}
