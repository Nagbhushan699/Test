package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DuplicateElemntsList {

	public static void main(String[] args) {
	List<Integer>nos=new ArrayList<Integer>();
	nos.add(10);
	nos.add(20);
	nos.add(30);
	nos.add(40);
	nos.add(10);
	nos.add(20);
	nos.add(40);
	System.out.println(nos);
   Set<Integer>numbers=new LinkedHashSet<Integer>(nos);
   Collections.reverse(nos);
   System.out.println(numbers);
	}

}
