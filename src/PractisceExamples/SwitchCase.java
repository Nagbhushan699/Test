package PractisceExamples;

import java.util.Scanner;

public class SwitchCase {
	public void show(String browser) {
		switch(browser){
		case "Chrome":System.out.println("Chrome"); 
		break;
		case "opera":System.out.println("Opera"); 
		break;
		case "UcBrowser":System.out.println("UcBrowser"); 
		break;
		default : System.out.println("Not a valid browser");
		}
	}

	public static void main(String[] args) {
		SwitchCase obj=new SwitchCase();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your browser name");
		obj.show(sc.next());

	}

}
