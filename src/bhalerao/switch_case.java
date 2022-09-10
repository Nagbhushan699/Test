package bhalerao;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		 int ch;
		 System.out.println("enter your choice");
		 Scanner s=new Scanner(System.in);
		 ch=s.nextInt();
		 switch (ch) {
		case 1:System.out.println("miss you");			
			break;
		case 2:System.out.println("love you");	
		 break;
		default: System.out.println("fuck you");
		
			break;
		}
		 

	}

}
