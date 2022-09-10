
public class copy_constructor {
	int x;
	String y;
	Double r;
	 copy_constructor(int a,String b,Double t)
	{
		x=a;y=b;r=t;
		System.out.println(x+" "+y+" "+r);
	}
	copy_constructor(copy_constructor ot)
	{
		x=ot.x;
		y=ot.y;
		r=ot.r;
		System.out.println(x+" "+y+" "+r);
	}


	public static void main(String[] args) {
		copy_constructor obj=new copy_constructor(1000,"bhalerao",10.558) ;
		copy_constructor ob=new copy_constructor(obj) ;
	}

}
