package PractisceExamples;

import java.util.Scanner;

public class StaticArraCricketer {

	public static void main(String[] args) {
	  Object r[]=new Object[4];
	  Scanner obj=new Scanner(System.in);
	  System.out.println("Enter your name");
	  r[0]=obj.next();
	  System.out.println("Enter your age");
	  r[1]=obj.nextInt();
	  System.out.println("Enter your salary");
	  r[2]=obj.nextDouble();
	  for(Object e:r) {
		  System.out.println(e);
	  }

	}

}
