package Collection_Frameworks;

import java.util.ArrayList;
import java.util.Iterator;

public class RollNos {

	public static void main(String[] args) {
	ArrayList <Integer>nos=new ArrayList<Integer>();
      nos.add(10);
      nos.add(20);
      nos.add(10);
      nos.add(30);
      nos.remove(0);
      nos.remove(nos.size()-1);
      nos.add(0,1);
      nos.add(nos.size()-1);
//      for(int i=0;i<nos.size()-1;i++) {
//    	  System.out.println(nos.get(i));
//      }
      Iterator sc=nos.iterator();
      while(sc.hasNext()) {
    	  System.out.println(sc.next());
      }
      
	}

}
