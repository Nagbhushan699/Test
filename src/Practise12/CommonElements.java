package Practise12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CommonElements {

	public static void main(String[] args) {
	List<Integer>no1=new LinkedList<Integer>();
	no1.add(10);
	no1.add(20);
	no1.add(30);
	no1.add(40); 
	no1.add(10);
	System.out.println("First list : "+no1);
	List<Integer>no2=new LinkedList<Integer>();
	no2.add(50);
	no2.add(60);
	no2.add(30);
	no2.add(40); 
	no2.add(70);
	System.out.println("Second list : "+no2);
	List<Integer>no3=new LinkedList<Integer>();
	no3.addAll(no1);
    no3.retainAll(no2);
    Iterator<Integer>itr=no3.iterator();
    while(itr.hasNext()) {
    	System.out.print("Common elements : "+itr.next()+" ");
    }
	
	}

}
