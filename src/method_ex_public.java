
public class method_ex_public {
	

	public int add(int a,int b)
	{
		int c=a+b;
		return c;
		
	}

	public static void main(String[] args) {
		
		method_ex_public obj=new method_ex_public();
		int result=obj.add(100, 200);	
		System.out.println("the sum of two numbers :"+" "+result);
	}

}
