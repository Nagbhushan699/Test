package bhalerao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class objcet_array {

	public static void main(String[] args) throws InputMismatchException{
		//object array
//	Object s[]= {10,10.44,"bhushan",'e'};
//	for(Object e:s)
//	{
//		System.out.println(e);
//	}
		Object s[]=new Object[4];
		System.out.println("enter array elements");
     Scanner ob=new Scanner(System.in);
       for(int e=0;e<s.length;e++)
       {
    	   s[e]=ob.nextInt();
       }
       for(Object r:s)
       {
    	  System.out.println(r);
       }
	}

}
