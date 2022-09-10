package Assignments;

import java.util.ArrayList;

public class Arraylist_ex5 {

	public static void main(String[] args) {
		//WAP to search an element in arraylist
		ArrayList <Integer>marklist=new ArrayList<Integer>();
		marklist.add(50);  //0 index
		marklist.add(60);   //1 index
		marklist.add(80);   //2 index
		marklist.add(90);  //3 index
		marklist.add(85);  //4 index
		
		System.out.println("Science marks : "+marklist.get(0));
		System.out.println("mathematic marks : "+marklist.get(4));
	}

}
