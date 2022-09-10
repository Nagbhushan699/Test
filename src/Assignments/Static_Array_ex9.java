package Assignments;

import java.util.Scanner;

public class Static_Array_ex9 {

	public static void main(String[] args) {
		// Using Array,try to print the following pattern on the console
		int a[]=new int[5];
		System.out.println("enter the elements");
       Scanner ob=new Scanner(System.in);
       for(int i=0;i<=a.length-1;i++)
       {
    	   a[i]=ob.nextInt();
       }
       for(int e:a)
       {
    	   System.out.println(" n = "+e);
       }
	}

}
