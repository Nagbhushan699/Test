
public class construcor_ex2 {
	int a,b;
	private construcor_ex2()
	{
		a=10;b=20;
	}
	void add()
	{
		int c=a+b;
		
		System.out.println("the sum of two numbers is :"+c);
		
	}

	public static void main(String[] args) {
		construcor_ex2 obj=new construcor_ex2();
		obj.add();

	}

}
