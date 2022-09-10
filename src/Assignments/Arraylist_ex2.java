package Assignments;

import java.util.ArrayList;

public class Arraylist_ex2 {

	public static void main(String[] args) {
		//WAP to update an element into array list at the first and last positions
	ArrayList ob=new ArrayList();
	  ob.add(100); //0
	  ob.add(20.00); //1
	  ob.add(2000); //2
	  ob.add("java"); //3	
	  ob.remove(0);
	  ob.add(0,5000);
	  ob.remove(3);
	  ob.add(3,"HTML");
	  for(Object r:ob)
	  {
		  System.out.println(r);
	  }
	}

}
