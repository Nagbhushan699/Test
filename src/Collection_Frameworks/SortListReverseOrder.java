package Collection_Frameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/**Q.1 Write a function which returns a list by by removing the duplicate elements from the list and
 **sorting the list in reverse order*/ 
public class SortListReverseOrder {
   public static List<Integer> mobileNames(List<Integer>rollNos) {                                                                              
           Set<Integer>numbers=new HashSet<Integer>();
           numbers.addAll(rollNos);
           rollNos.removeAll(rollNos);
           rollNos.addAll(numbers);
            Collections.sort(rollNos);
            Collections.reverse(rollNos);
            Iterator<Integer>itr=rollNos.iterator();
            while(itr.hasNext()) {
            	itr.next();
              }
            return rollNos;

}
	public static void main(String[] args) {
		List<Integer>rollNos=new ArrayList<Integer>();
		     rollNos.add(50);
		     rollNos.add(10);
		     rollNos.add(30);
		     rollNos.add(40);
		     rollNos.add(10);
		     rollNos.add(50);
		     rollNos.add(10);
		     rollNos.add(20);
         System.out.println(rollNos);
          List<Integer>results=mobileNames(rollNos);
          System.out.println(results);
	}

}
