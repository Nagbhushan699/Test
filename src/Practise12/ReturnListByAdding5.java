package Practise12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReturnListByAdding5 {
	public static List<Integer>add(List<Integer>numbers){
		ListIterator<Integer>itr=numbers.listIterator();
		List<Integer>addNos=new LinkedList<Integer>();
		while(itr.hasNext()) {
			addNos.add(itr.next()+5);
		}
		return addNos;
	}

	public static void main(String[] args) {
		List<Integer>numbers=new ArrayList<Integer>();
           numbers.add(10);
           numbers.add(20);
           numbers.add(30);
           numbers.add(40);
           numbers.add(50);
          List<Integer>result= add(numbers);
          System.out.println(result);
	}

}
