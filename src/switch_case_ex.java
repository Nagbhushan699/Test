import java.util.Scanner;

public class switch_case_ex {

	public static void main(String[] args) {
	        int ch;
	        System.out.print("enter your choice");
	        Scanner obj=new Scanner(System.in);
	        ch=obj.nextInt();
	        
	        switch(ch)
	        {
	      
	        case 1: System.out.println("my name is bhushan");
	        break;
	        case 2: System.out.println("my name is ram");
	        break;
	        case 3: System.out.println("my name is vaibhav");
	        break;
	        case 4: System.out.println("my name is karan");
	         break;
	         default:System.out.println("invalid");
	        	 
	        }
	}

	}

	


