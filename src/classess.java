import java.util.Scanner;

public class classess {
	int a,b,c; //instance variable
  public void add()
   {
	   
	   System.out.println("enter the two numbers is :");
	   Scanner ob=new Scanner(System.in);
	   a=ob.nextInt();
	   b=ob.nextInt();
   }
  public void sum()
  {
	  int c=a+b;
	  System.out.println(" the sum of two numbers is :"+c);
	  
  }
	public static void main(String[] args) {
		classess obj= new classess();
		
		obj.add();
		obj.sum();

	}

}
