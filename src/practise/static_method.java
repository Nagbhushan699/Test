package practise;
public class static_method {
	 
	static int add()
	{
		int a=10,b=5;
		int c=a+b;
		return c;
		
	}
	public static void main(String [] args)
	{
		int re=add();
		System.out.println("the sum of two number is : "+re);
	}
}
