package bhalerao;

import java.util.Scanner;

public class array_ex3 {

	public static void main(String[] args) {
	//String array
//		String s[]=new String[2];
//		s[0]="bhushan";
//		s[1]="bhale";
//		for(int i=0;i<=s.length-1;i++)
//		{
//			System.out.println(s[i]);
//		}
//		String e[]= {"bhushan","bhalerao"};
////		System.out.println(e[0]);
////		System.out.println(e[1]);
////		for(int i=0;i<e.length;i++)
////		{
////			System.out.println(e[i]);
////		}
//		for(String w:e)
//		{
//			System.out.println(w);
//		}
		String s[]=new String[3];
		System.out.println("enter array elements :");
		Scanner e=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			s[i]=e.nextLine();
		}
		for(String r:s)
		{
			System.out.println(r);
		}
		
	}

}
