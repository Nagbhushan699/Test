package BankProject;

import java.util.Scanner;

public class Bank {
	public static void main(String []args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter bank name\t   : ");
		BankAccount.bankName=scn.nextLine();
		System.out.println("enter branch name\s : ");
		BankAccount.branchName=scn.nextLine();
		System.out.println("enter IFSC Code\t   : ");
		BankAccount.ifsc=scn.nextLine();
		System.out.println("How many accounts do you want to open");
		int noOfAcc=scn.nextInt();
		BankAccount []acc=new BankAccount[noOfAcc];
		for(int i=0;i<noOfAcc;i++) {
			System.out.println("Enter customer "+(i+1)+" details");
			acc[i]=new BankAccount();
			System.out.println("Enter accountNum\t : ");
			acc[i].accNO=scn.nextInt();
			System.out.println("Enter accounHName\t : "); scn.nextLine();
			acc[i].accHName=scn.nextLine();
			System.out.println("enter your balance : ");
			acc[i].balance=scn.nextDouble();
			System.out.println("Enter customer "+(i+1)+"address details ");
			acc[i].address=new Address();
			System.out.println("Enter dNum : ");
		    acc[i].address.dnum=scn.nextInt();
		    System.out.println("Enter strNum : ");
		    acc[i].address.strnum=scn.nextInt();
		    System.out.println("Enter City : ");
		    acc[i].address.city=scn.next();
		}
		System.out.println("\n All Account details");
		for(int i=0;i<noOfAcc;i++) {
			System.out.println("acc"+(i+1)+"details");
			acc[i].display();
			System.out.println();
		}
		
		System.out.println("performing business operations on first account \n");
		acc[0].deposit(50000);
		double amount=acc[0].withdraw(2000);
//		acc[0].currentBalance();
//        acc[0].transferMoney(destAcc, 5000);
		
	}

	

}
