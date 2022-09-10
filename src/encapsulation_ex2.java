import java.util.Scanner;

public class encapsulation_ex2 {
	private int a,b,c;
	private void show()
	{
		System.out.println("enter two numbers");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		c=a*b;
		System.out.println("the  multi of two numbers"+c);
	}
	private void disp() {
		a=10;b=20;
		c=a+b;
		System.out.println("the  add of two numbers"+c);
		
		
	}

	public static void main(String[] args) {
		encapsulation_ex2 ob=new encapsulation_ex2();
		ob.show();
		ob.disp();

	}
	

}
