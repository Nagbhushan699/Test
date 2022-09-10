package encapsulation;

import java.util.Scanner;

public class Citizen {

	public static void main(String[] args) {
	VoterApplication obj=new VoterApplication();
	Scanner scn=new Scanner(System.in);
	try {
	  System.out.println("Enter application id\t:");obj.setAppId(scn.nextInt());
	  System.out.println("Enter application name\t:");obj.setapplicantName(scn.next());
	  System.out.println("Enter consultancy name\t:");obj.setConsultancy(scn.next());
	  System.out.println("Enter citizens age\t:");obj.setAge(scn.nextInt());
	}
	catch(IllegalArgumentException e) {
		System.out.println("error : "+e.getMessage());
	}
	VoterApplication obj1=new VoterApplication();
	Scanner scn1=new Scanner(System.in);
	try {
	  System.out.println("Enter application id\t:");obj1.setAppId(scn1.nextInt());
	  System.out.println("Enter application name\t:");obj1.setapplicantName(scn1.next());
	  System.out.println("Enter consultancy name\t:");obj1.setConsultancy(scn1.next());
	  System.out.println("Enter citizens age\t:");obj1.setAge(scn1.nextInt());
	}
	catch(IllegalArgumentException e) {
		System.out.println("error : "+e.getMessage());
	}
	}
	}

  

