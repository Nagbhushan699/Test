package Collection_Frameworks;

import java.util.ArrayList;
import java.util.Collection;

public class Factory {
 int Order(int items) {
//	 ArrayList list=new ArrayList();
//	 list.add(items);
	 for(int i=0;i<=items;i++) {
		 Bike1 b1=new Bike1();
		 b1.setName("FZ");
		 b1.setChassisNo(50);
		 b1.display();
	 }
	return items;
 }
}
