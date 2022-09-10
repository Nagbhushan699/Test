package Collection_Frameworks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//3.write a function to return addition of all the values in the map
public class MapAddition {
   public  static Integer add(Map<Integer,Integer>nos) {
	   Iterator<Integer>itr=nos.keySet().iterator();
	   Integer sum=0;
	   while(itr.hasNext()) {
		   sum+=nos.get(itr.next());
	   }
	   return sum;
   }
	public static void main(String[] args) {
		Map<Integer,Integer> nos=new HashMap<Integer,Integer>();
       
       nos.put(1, 11);
       nos.put(2, 13);
       nos.put(3, 14);
       nos.put(4, 15);
       nos.put(5, 16);
      Integer result= add(nos);
      System.out.println("Result : "+result);
	}

}
