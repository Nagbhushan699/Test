package Practise12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReturnAdditonList {
	public static Integer add(List<Integer>numbers) {
		Iterator<Integer>itr=numbers.iterator();
		int sum=0;
		while(itr.hasNext()) {
			sum=sum+itr.next();
		}
		return sum;
	}

	public static void main(String[] args) {
		List<Integer>numbers=new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		Integer sum=add(numbers);
		System.out.println(sum);
	}

}
