package Assignments;

import java.util.ArrayList;

public class ArrayList_ex4 {

	public static void main(String[] args) {
		//WAP to retrieve an element(at a specified index) from a given array list
		ArrayList  op=new ArrayList();
		op.add(100);  //0 index
		op.add(200);   //1 index
		op.add(300);   //2 index
		op.add("java");  //3 index
		
		System.out.println(op.get(3));

	}

}
