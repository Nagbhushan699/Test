package practise;

public class copy_constructor {
	int a,b,c;
	copy_constructor()
	{
		int a=50;
		int b=60;
		int c=a*b;
		System.out.println("the multiplication of two numbers : "+c);
	} 
	copy_constructor(copy_constructor r)
	{
		 this.a=r.a;
	 this. b=r.b;
		System.out.println("the sum of two numbers is : "+a+" "+b);
	}
	public static void main(String[] args) {
		copy_constructor obj=new copy_constructor();
		copy_constructor ob=new copy_constructor(obj);

	}

}
