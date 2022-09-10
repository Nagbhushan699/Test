package Collection_Frameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*Q.5 create two list , add all elements not duplicate in third list  */
public class DuplicatesList {

	public static void main(String[] args) {
	ArrayList<Integer>serialNoList1=new ArrayList<Integer>();
     serialNoList1.add(10);
     serialNoList1.add(20);
     serialNoList1.add(30);
     serialNoList1.add(10);
     serialNoList1.add(20);
     ArrayList<Integer>serialNoList2=new ArrayList<Integer>();
     serialNoList2.add(40);
     serialNoList2.add(50);
     serialNoList2.add(60);
     serialNoList2.add(50);
     serialNoList2.add(40);
     Set<Integer>numbers=new HashSet<Integer>();
      numbers.addAll(serialNoList1);
      numbers.addAll(serialNoList2);
      ArrayList<Integer>allserialNoList=new ArrayList<Integer>();
      allserialNoList.addAll(numbers);
      Collections.sort(allserialNoList);
      System.out.println(allserialNoList);
	}

}
