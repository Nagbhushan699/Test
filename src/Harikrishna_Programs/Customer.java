package Harikrishna_Programs;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter name ");
		String name=scn.next();
		System.out.println("Enter email ");
		String email=scn.next();;
		System.out.println("Enter mobile ");
		long mobile=scn.nextLong();
		System.out.println("Enter dob ");
		String dob=scn.next();
		System.out.println("Enter gender ");
		char gender=scn.next().charAt(0);
		FacBookAccount fb=new FacBookAccount(name,email,mobile,gender,dob);
		System.out.println("Enter schoolName ");
		fb.setSchoolName(scn.next());
		System.out.println("Enter collegeName ");
		fb.setCollegeName(scn.next());
		System.out.println("Enter workingcompanyName ");
		fb.setWorkingCompanyName(scn.next());
		fb.display();
	}

}
