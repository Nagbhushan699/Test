package Collection_Frameworks;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Addition {
	//1.Write a function which will return the addition of all the elements in the list using iterator
	public static int add(List<Integer>numbers) {
		  ListIterator <Integer>ChechIterator=numbers.listIterator();
         int sum=0;
         while(ChechIterator.hasNext()) {
        	 sum+=ChechIterator.next();
         }
         return sum;
			
	}
	public static void main(String[] args) {
    List <Integer> numbers=new ArrayList<Integer>();
       numbers.add(10);
       numbers.add(11);
       numbers.add(12);
       numbers.add(13);
       numbers.add(14);
       numbers.add(15);
       int result=  add(numbers);
       System.out.println("Addition : "+result);
     
	}

}
