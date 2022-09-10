package Practise12;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckElementsList {
    
	public static void main(String[] args) {
		ArrayList<String>numbers=new ArrayList<String>();
		numbers.add("Bhushan");
		numbers.add("Karan");
		numbers.add("Vaibhav");
		numbers.add("Ram");
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter Name : ");
      System.out.println(numbers.contains(scn.next()));
	}

}
