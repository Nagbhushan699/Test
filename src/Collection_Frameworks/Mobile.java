package Collection_Frameworks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Mobile {

	public static void main(String[] args) {
		Set mobile=new HashSet();
		mobile.add("Vivo");
		mobile.add(10.56);
		mobile.add("Realme");
		Iterator itr=mobile.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
