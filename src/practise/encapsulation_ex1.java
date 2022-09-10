package practise;

public class encapsulation_ex1 {
	private int a=10;
	private String s="bhushan";
	public void show()
	{
		System.out.println("the values are : "+a+" "+s);
	}			
	public static void main(String[] args) {
		encapsulation_ex1 obj=new encapsulation_ex1();
		obj.show();

	}

}
