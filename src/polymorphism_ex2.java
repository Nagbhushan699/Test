
public class polymorphism_ex2 {
	void show(int a,String b)
	{
		System.out.println(a+" "+b);
	}
}
class tangle extends polymorphism_ex2{
	void show(String b,int c)
	{
		System.out.println(b+" "+c);
	}


	public static void main(String[] args) {
		polymorphism_ex2 obj=new polymorphism_ex2();
		obj.show(10, "bhushan");
		tangle ob=new tangle();
		ob.show("bhalerao",30);

	}

}
