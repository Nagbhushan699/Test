import java.util.Scanner;

public class single_dim_arr {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		try {
		  String b[]=new String[4];
		  System.out.println("enter array elements");
		  Scanner obj=new Scanner(System.in);
         for(int j=0;j<5;j++)
         {
        	b[j] =obj.nextLine();
         }
         for(String c:b)
         {
        	  System.out.println(" array elements are :"+" "+c); 
         }
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception : "+e.getMessage());
		}
	}

}
