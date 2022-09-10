package practise;

import java.util.Scanner;

public class ram_constructor {
	int a=10,b=20;
	ram_constructor()
	{
		int c=a*b;
		System.out.println("the multiplication of two numbers : "+c);		
	}
	void add()
	{
		int d=a+b;
		System.out.println("the sum of two numbers : "+d);
		
	}

	public static void main(String[] args) {
		ram_constructor obj=new ram_constructor();
		obj.add();

	}

}
