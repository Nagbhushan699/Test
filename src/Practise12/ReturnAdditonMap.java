package Practise12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ReturnAdditonMap {
	public static Integer add(Map<Integer,Integer>numbers) {
		int sum=0;
		Iterator<Integer>itr=numbers.keySet().iterator();
		while(itr.hasNext()) {
			sum=sum+numbers.get(itr.next());
		}
		return sum;
	}
    
	public static void main(String[] args) {
		Map<Integer,Integer>numbers=new HashMap<Integer,Integer>();
		numbers.put(1, 10);
		numbers.put(2, 20);
		numbers.put(3, 30);
		numbers.put(4, 40);
		numbers.put(5, 50);
		Integer result=add(numbers);
		System.out.println(result);
		
		

	}

}
