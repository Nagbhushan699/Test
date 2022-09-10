package Collection_Frameworks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TV {

	public static void main(String[] args) {
		Set tv=new HashSet();
         tv.add("Samsung");
         tv.add("LG");
         tv.add(10);
         tv.add(10.566);
         Iterator itr=tv.iterator();
         while(itr.hasNext()) {
        	 System.out.println(itr.next());
         }
	}

}
