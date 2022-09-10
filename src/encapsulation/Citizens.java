package encapsulation;

import java.util.Scanner;

public class Citizens {
	public static void main(String[]args) {
		VoterCard obj=new VoterCard();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter App ID");
		obj.setAppId(sc.nextInt());
		System.out.println("Enter Applicant Name");
		obj.setApplicantName(sc.next());
		try {
		System.out.println("Enter Applicant age");
		obj.setAge(sc.nextInt());
		}
		catch(IllegalArgumentException e) {
			System.out.println("Error : "+e.getMessage());
		}
		obj.showInfo(obj.getAppId(), obj.getApplicantName(), obj.getAge());
	}
	
	
 
}
