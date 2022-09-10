package Assignments;

import java.util.ArrayList;

public class Arraylist_ex3 {

	public static void main(String[] args) {
		//WAP to remove  the third element from array list.
	ArrayList emp=new ArrayList();
	emp.add(25);  //0 index
	emp.add("Aniket"); //1 index
	emp.add(50000); //2 index
	emp.add(8888); //3 index
	emp.add("electric"); //4
	emp.remove(3);
	for(Object e:emp)
	{
		System.out.println("employee data  : "+e);
	}
	

	}

}
