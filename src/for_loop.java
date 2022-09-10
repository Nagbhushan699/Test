import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		  int a=0,n;
		  System.out.println("enter the value of n");
		  Scanner obj=new Scanner(System.in);
		  n=obj.nextInt();
		  
		  for(int i=100;i>=n;--i)
		  {
			  System.out.println(""+i); 		  
		  }
		  
	}

}
