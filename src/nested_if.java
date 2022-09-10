import java.util.Scanner;

public class nested_if {

	public static void main(String[] args) {
	    int a,b,c;
	    System.out.println("enter the three number");
	    Scanner obj=new Scanner(System.in);
          a=obj.nextInt();
          b=obj.nextInt();
          
          if(a==5)
          {
        	  if(a==6)
              {
        		  System.out.println(" the number is equal to 5");  
              }
              else
              {
            	  System.out.println(" the number is not equal to 5"); 
              }  
          }
          else
          {
        	  if(b==8)
              {
        		  System.out.println(" the number is equal to 8");   
              }
              else
              {
            	  System.out.println(" the number is not  equal to 8");  
              }
          }
	}

}
