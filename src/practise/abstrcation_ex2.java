package practise;

abstract public class abstrcation_ex2 {
	String s;
	int nooftyres;
	void show(String s,int nooftyres)
	{
		this.s=s;
		this.nooftyres=nooftyres;
		System.out.println("there are "+s+" "+nooftyres);
	}
	abstract void gearbox();
}	
 class bhushan extends abstrcation_ex2
{
	int n;
	void gearbox(int n)
	{
		this.n=n;
		System.out.println("there are "+n+" "+"gears");
	}
	public static void main(String[] args) {
		bhushan obj=new bhushan ();
		obj.show("nissan", 6);
		obj.gearbox(5);

	}
	
	

}
