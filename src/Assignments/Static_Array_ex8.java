package Assignments;

import java.util.Scanner;

public class Static_Array_ex8 {

	public static void main(String[] args) {
		  //WAP to create a static array ,having following cricket data:
		//-name,age,team name,DOB,gender,Strike Rate
		//try to create multiple object arrays for diffrent players
		//try to print all the values of each player on the console
//		Object cricket_data[]=new Object[5];
//		cricket_data[0]="Aniket";
//		cricket_data[1]="Mumbai Indians";
//		cricket_data[2]=6/10/1999;
//		cricket_data[3]='M';
//		cricket_data[4]=200.00;
//		for(Object e:cricket_data)
//		{
//			System.out.println("Cricket data  : "+e);
//		}
//		Object cricket_data[]=new Object[5];
//		cricket_data[0]="Harshal";
//		cricket_data[1]="Gujrat Titans";
//		cricket_data[2]=2/1/1999;
//		cricket_data[3]='M';
//		cricket_data[4]=150.00;
//		for(Object e:cricket_data)
//		{
//			System.out.println("Cricket data  : "+e);
//		}
		Object cricket_data[]=new Object[5];
		System.out.println("enter the cricket data");
		Scanner obj=new Scanner(System.in);
		for(int i=0;i<cricket_data.length;i++)
		{
			cricket_data[i]=obj.nextLine();
		}
		for(Object r:cricket_data)
		{
			System.out.println("Cricket data : "+r);
		}
		

	}

}
