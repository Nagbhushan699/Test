package practise;

interface interfaces_ex4 {
	 void disp();

}
interface nhu{
	 void show();
}
class bhalu implements interfaces_ex4,nhu
{
	public void disp(int a,String s)
	{
		System.out.println(a+" my name is : "+s);
	}
	public void show(int a,String s,float e)
	{
		System.out.println(a+" my name is : "+s+" "+e);
	}
	

	public static void main(String[] args) {
		bhalu obj=new bhalu();
		obj.disp(10," bhushan");
		obj.show(10,"bhalerao", 10.66f);
		

	}
	

}
