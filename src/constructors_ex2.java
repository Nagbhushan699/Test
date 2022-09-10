
public class constructors_ex2 {
	int a,b,c;
	constructors_ex2(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
   public void add()
   {
	   int c=a+b;
	  System.out.println(c) ;
   }
	public static void main(String[] args) {
		constructors_ex2 obj=new constructors_ex2(10,35);
		obj.add();

	}

}
