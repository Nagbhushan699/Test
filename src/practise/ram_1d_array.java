package practise;

import java.util.Scanner;

public class ram_1d_array {

	public static void main(String[] args) {
		   int a []=new int [5];
		   System.out.println("enter array elements");
		   Scanner ob=new Scanner(System.in);
		   for(int i=0;i<5;i++)
		   {
			   a[i]=ob.nextInt();
		   }
		   for(int c:a)
		   {
			   System.out.println("array elements are following : "+c);
		   }

	}

}
