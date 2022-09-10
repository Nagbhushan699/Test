package PractisceExamples;

import java.util.Scanner;

public class IntegerSwitch {
	public void show(char a) {
		switch(a) {
		case 'c':System.out.println("I love you");
		break;
		case 'd':System.out.println("I miss you");
		break;
		case 'e':System.out.println("I fuck you");
		break;
		default : System.out.println("Hi...");
		}	
	}
	public static void main(String[] args) {
		IntegerSwitch obj=new IntegerSwitch();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you case");
		obj.show(sc.next().charAt(0));

	}

}
