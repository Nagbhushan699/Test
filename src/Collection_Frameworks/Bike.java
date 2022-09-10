package Collection_Frameworks;

import java.util.ArrayList;
import java.util.Iterator;

public class Bike {

	public static void main(String[] args) {
		ArrayList bikes=new ArrayList();
             bikes.add("Honda");
             bikes.add(10);
             bikes.add(20.566);
             bikes.add("Apache");
             Iterator itr=bikes.iterator();
             while(itr.hasNext()) {
            	 System.out.println(itr.next());
             }
//             int i=0;
//             do {
//            	 System.out.println(bikes.get(i));
//            	 i++;
//             }
//             while(i<bikes.size()-1);
	}

}
