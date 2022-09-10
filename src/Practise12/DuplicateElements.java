package Practise12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateElements {
public static List<Integer>list(List<Integer>numbers){
	Set<Integer>nos=new TreeSet<Integer>();
	nos.addAll(numbers);
	numbers.removeAll(numbers);
	numbers.addAll(nos);
	Collections.reverse(numbers);
	Iterator<Integer>itr=numbers.iterator();
	while(itr.hasNext()) {
		itr.next();
	}
	return numbers;
	
}
	public static void main(String[] args) {
		List<Integer>numbers=new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		List<Integer>result=list(numbers);
		for(Integer res:result) {
			System.out.println(res+" ");
		}
		
	}

}
