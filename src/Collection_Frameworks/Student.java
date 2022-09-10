package Collection_Frameworks;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {

	public static void main(String[] args) {
      ArrayList stu=new ArrayList();
      stu.add("Bhushan");
      stu.add(10);
      stu.add(50.36);
      stu.add("Civil");
      Iterator itr=stu.iterator();
      while(itr.hasNext()) {
    	  System.out.println(itr.next());
      }
	}

}
