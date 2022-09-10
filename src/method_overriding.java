
public class method_overriding {
	void show(int a,Double b)
	{
		System.out.println(a+" "+b);
	}
}
class red extends method_overriding{
	
	void show(int a,Double b)
	{
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		method_overriding obj=new method_overriding();
		obj.show(50, 10.555);
		red ob=new red();
		ob.show(10,50.233);

	}

}
