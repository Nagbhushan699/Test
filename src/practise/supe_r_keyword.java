package practise;

public class supe_r_keyword {
	

	public char[] a;

	void add()
	{
		int a=10;
	}
}
class bhake extends supe_r_keyword
{
	void sum()
	{
		super.a=a;
		System.out.println(a);
	}

	public static void main(String[] args) {
		bhake obj=new bhake();
		obj.sum();
		

	}

}
