
interface  interface_ex3 {
	public static final int a=0;
 void disp();
 void show();
}
 class madhav implements interface_ex3{
	public  void disp() 
	 {
		 System.out.println("my name is bhushan");
	 }
	public void show()
	{
		 System.out.println("my name is budhha");
	}
 }
 class pammi implements interface_ex3{
	 public  void disp() 
	 {
		 System.out.println("my name is bhushanbhalero");
	 }
	public void show()
	{
		 System.out.println("my name is budhhakale");
	}
 }
 class pap implements interface_ex3 {
	public  void disp() {
		 System.out.println("my name is geeta");
	 }
	public void show()
	{
		 System.out.println("my name is bhu");
	}
 
	public static void main(String[] args) {
		madhav obj=new madhav();
		obj.disp();
		obj.show();
		pammi ob=new pammi();
		ob.disp();
		ob.show();
		pap pp=new pap();
		pp.disp();
		pp.show();
		
		
	}



}
