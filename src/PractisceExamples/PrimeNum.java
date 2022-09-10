package PractisceExamples;

import java.util.Scanner;

public class PrimeNum {
   public void primeNum(int no) {
	   int check=0;
	   for(int i=2;i<=no-1;i++) {
		   if(no%2==0) {
			   check++;
		   }
	   }
	   if(check==0) {
		   System.out.println(no+" is prime no");
	   }
	   else {
		   System.out.println(no+" is not prime no");
	   }
   }
	public static void main(String[] args) {
		PrimeNum obj=new PrimeNum();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number ");
		obj.primeNum(sc.nextInt());

	}

}
