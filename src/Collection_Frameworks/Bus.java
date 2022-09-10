package Collection_Frameworks;

import java.util.HashMap;
import java.util.Map;

public class Bus {

	public static void main(String[] args) {
	 Map bus=new HashMap();
	 bus.put("Bus Name ","RedBus");
	 bus.put("Bus Color", "Blue");
	 bus.put("Bus no","RedBus");
	 System.out.println(bus.get("Bus Name "));
	 System.out.println(bus.get("Bus Color"));
     System.out.println(bus.get("Bus no"));
	}

}
