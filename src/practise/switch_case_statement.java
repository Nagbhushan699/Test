package practise;

import java.util.Scanner;

public class switch_case_statement {

	public static void main(String[] args) {
		   System.out.println("enter your choice");
		   Scanner ch=new Scanner(System.in);
		   int a=ch.nextInt();
		   int n=30;
		   
		   switch(a)
		   {
		   
		  
		  case 1: 
			  if(n==20)
			  {
				  System.out.println("n is equal to 20");
			  }
			  else
			  {
				  System.out.println("n is not equal to 20");
			  }	  
			 break;
		   case 2:  System.out.println("a is equal to 20");
		      break;
		   case 3:System.out.println("a is equal to 40");
		   break;
		   default:System.out.println("no value matches");
	}
	}
}
