package Practise12;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		int a[][]=new int [2][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements for 1st array: ");
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				 a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
			  System.out.println("Array Elements are : "+a[i][j]);
			}
		}


	}

}
