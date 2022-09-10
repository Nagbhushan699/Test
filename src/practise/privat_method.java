package practise;

public class privat_method {
	 int a=10;
	 int b=20;
	 static int r=10,s=5;
	private void add()
	{
		int c=a+b;
		System.out.println(c);
	}
	public int sum()
	{
		int d=a*b;
		return d;
	}
 static void divi()
 {
	 int e=r/s;
	 System.out.println("the division of two numbers is :"+e);
 }
 protected void sub()
 {
	 int r=a-b;
	 System.out.println("the substartcion of a and b : "+r);
 }

	public static void main(String[] args) {
		privat_method  obj=new privat_method ();
		obj.add();
		int result =obj.sum();
		System.out.println("the multiplication of two numbers : "+ result);
        divi();
        obj.sub();
	}

}
