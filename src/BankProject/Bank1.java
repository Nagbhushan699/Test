package BankProject;

import java.util.Scanner;

public class Bank1 {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  //static values read from kb\
	  System.out.println("enter your bank Name");
	  BankAccount.bankName=sc.nextLine();
	  System.out.println("enter your branch Name"); 
	  BankAccount.branchName=sc.nextLine();
	  System.out.println("enter your bank ifsc"); 
	  BankAccount.ifsc=sc.nextLine();
	  //read nonstatic values from kb
	  System.out.println("How many account do you want to create");
	  int noOfAcc=sc.nextInt();
	   BankAccount acc[]=new BankAccount[noOfAcc];
	  for(int i=0;i<noOfAcc;i++) {
		  System.out.println("customer  "+(i+1)+" details \n ");
		  acc[i]=new BankAccount();
		  System.out.println("enter your accNum \n ");
		  acc[i].accNO=sc.nextInt();y
		  System.out.println("enter accHName \n"); sc.nextLine();
		  acc[i].accHName=sc.nextLine();
		  System.out.println("enter your balance : ");
		  acc[i].balance=sc.nextInt();
		  System.out.println("enter customer address details \n ");
		  acc[i].address=new Address();
		  System.out.println("enter Dnum \n ");
		  acc[i].address.dnum=sc.nextInt();
		  System.out.println("enter strnum \n ");
		  acc[i].address.strnum=sc.nextInt();
		  System.out.println("enter city \n ");
		  acc[i].address.city=sc.next();
	  }
	  for(int i=0;i<noOfAcc;i++) {
		  acc[i].display();
	  }
	  //call methods
	  try {
	  acc[0].deposit(-500);
	  acc[0].withdraw(2000);
	  }
	  catch(IllegalArgumentException | IllegalStateException e) {
		  System.out.println("Error : "+e.getMessage());
	  }

	}

}
