package Collection_Frameworks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Laptop {

	public static void main(String[] args) {
	  Map lap=new HashMap();
       lap.put("Url", "www.ggogle.com");
       lap.put("Username","Nagbhushan699");
       lap.put("passWord", "6989");
       System.out.println(lap.get("Url"));
       System.out.println(lap.get("Username"));
       System.out.println(lap.get("passWord"));
      
       
	}

}
