import java.util.Scanner;

public class methods_ex1 {
	 int a,b;
	 public void add()
	 {
		
		 System.out.print("enter the value of two elements");
		 Scanner obj=new Scanner(System.in);
		 a=obj.nextInt();
		 b=obj.nextInt();
		 int c=a+b;
		 System.out.println("the sum of two numbers is :"+c);
	 }
}
	 class bgt extends methods_ex1{
		

		public void multi() {
		  int c=a*b;
		  System.out.println("the multi of two numbers is :"+c);
		 }
	public static void main(String[] args) {
		 bgt bol=new bgt();
		bol.add();
		bol.multi();
        
	}
	 }
	

	


