package practise;

import java.util.Scanner;

public class ram_2d_arr {

	public static void main(String[] args) {
	   int a[][]=new int[2][3];
	   System.out.println("enter array elements");
	   Scanner obj=new Scanner(System.in);
	   for(int i=0;i<2;i++)
	   {
		   for(int j=0;j<3;j++)
		   {
			  a[i][j]=obj.nextInt();
		   }
	   }
	   for(int i=0;i<2;i++)
	   {
		   for(int j=0;j<3;j++)
		   {
			   System.out.println("array elements are : "+a[i][j]);
		   }
		   System.out.println();
	   }

	}

}
