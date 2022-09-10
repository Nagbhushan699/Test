
public class methods_ex2 {
	protected void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
}
class bhalu extends methods_ex2{
	protected void sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		bhalu obj=new bhalu();
		obj.add(100, 20);
		obj.sub(50, 30);
		
	}
}



