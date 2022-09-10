
public class inheritance_ex3 {
	int a;String s;Double e;
	void disp()
	{
		a=10;
		s="bhalerao";
		e=10.555;
		System.out.println(a+" "+s+" "+e);
	}
	
}
class pam extends inheritance_ex3{
	void show()
	{
		a=20;
		s="nagbhushan";
		e=10.666;
		System.out.println(a+" "+s+" "+e);
	}

	public static void main(String[] args) {
       pam obj=new pam();
       obj.disp();
       obj.show();

	}

}
