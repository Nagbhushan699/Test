
public class object {
	int c;
	String d;
	object(int a,String b)
	{
		c=a;
		d=b;
		System.out.print(c+" "+d);
	}
	object(object ref)
	{
		 c=ref.c;
		 d=ref.d;
		 System.out.print(c+" "+d); 
	}
	public static void main(String[] args) {	  
		object obj=new object(10,"bhushan");  
		object ob=new object(10,"bhushan");		  
	}

}
