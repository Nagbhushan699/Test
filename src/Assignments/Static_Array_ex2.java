package Assignments;

import java.util.Scanner;

public class Static_Array_ex2 {

	public static void main(String[] args) {
		//create two integer arrays of size 10 each and add the elements at index from both arrays and add them in third array
	    int a[]= {1,2,3,4,5,6,7,8,9,10};
	    int b[]= {10,11,12,13,14,15,16,17,18,19,20};
	    int c[]=new int[a.length+b.length];
	    for(int i=0;i<a.length;i++)
	    {
	    	c[i]=a[i];
	    }
	    for(int j=0;j<b.length;j++)
	    {
	    	c[a.length+j]=b[j];
	    }
	    for(int k=0;k<a.length+b.length;k++)
	    {
	    	System.out.println(c[k]+" ");
	    }

	}

}
