package Collection_Frameworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReturnArrayList {
	//2.Write a function which will return the addition of all the elements in the List by adding 5 in each element
	public static List<Integer> add(List<Integer> numbers) {
		List<Integer>nos=new ArrayList<>();x 
		 for(int i=0;i<numbers.size();i++) {
	 	    nos.add(numbers.get(i)+5);
	 		 }
		return nos;
	}

	

	public static void main(String[] args) {
		List <Integer>numbers=new ArrayList<Integer>();
         numbers.add(10);
         numbers.add(20);
         numbers.add(30);
         numbers.add(40);
         List<Integer> result= add(numbers);
         for(Integer nos:result) {
        	 System.out.println(nos);
         }
     
	}

}
