import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		 int pwd,pass,pin;
		 System.out.println("enter the password");
		 Scanner obj=new Scanner(System.in);
		 pwd=obj.nextInt();
		 pass=obj.nextInt();
		 pin=obj.nextInt();
  if(pwd==123 )
  {
	  System.out.println(" the password is correct"); 
  }
  else if( pass==358)
  {
	  System.out.println(" the password is right");
  }
  else if( pin==158)
  {
	  System.out.println(" the password is absolute");
  }
  else
  {
	  System.out.println("invalid password");
  }
	}

}
