package practise;

abstract public class abstraction_ex2 {
	int a=10,b=20,c;
	abstract void add();
	  void multi()
	{
		c=a*b;
		System.out.println("the multiplication of two numbers is : "+c);
	}
}
class bhyt extends abstraction_ex2
{
	public void add()
	{
		c=a+b;
		System.out.println("the sum of two numbers is : "+c);
	}


	public static void main(String[] args) {
		 bhyt obj=new  bhyt();
		 obj.multi();
		 obj.add();

	}

}
