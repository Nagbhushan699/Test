
public class hierarchay_ex2 {
	String b;
	String t;
	void disp()
	{
		 b="bhalerao";
		 t="nagu";
		 System.out.println(b+" "+t);
}
}
class bhu extends hierarchay_ex2{
	void show()
	{
		b="ram";
		t="jamge";
		 System.out.println(b+" "+t);
}
}
class madh extends hierarchay_ex2{
	void fun() {
		b="karan";
		t="ingole";
		 System.out.println(b+" "+t);
}
	public static void main(String[] args) {
		bhu obj1=new bhu();
		madh obj=new madh();
		obj1.show();
		obj.fun();


	}

}
