package Assignments;

import java.util.ArrayList;
public class Arraylist_ex1 {

	public static void main(String[] args) {
		//WAP to to create new arraylist ,Add some colors(String) and printout the collection
		ArrayList<String>colors=new ArrayList<String>();
		colors.add("white");
		colors.add("black");
		colors.add("blue");
		colors.add("brown");
		colors.add("red");
		colors.add("yellow");
		for(String e:colors)
		{
			System.out.println(e);
		}
		
		

	}

}
