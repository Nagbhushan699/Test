package Assignments;

import java.util.ArrayList;

public class Arraylist_ex6 {

	public static void main(String[] args) {
	  //WAP to reverse elements in a arraylist and print the same
		ArrayList <Integer>numbers=new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		for(int i=numbers.size()-1;i>=0;i--)
		{
			System.out.println(numbers.get(i));
		}
	}

}
