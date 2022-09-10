package PractisceExamples;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
	Bank obj1=new Bank();
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Enter your name : ");
		String nam=sc.next();
		System.out.println("Enter your acc no : ");
		long nu=sc.nextLong();
		obj1.showBalance(nam, nu);
	}
	catch(IllegalArgumentException e) {
		System.out.println("Error : "+e.getMessage());
	}

	}

}
