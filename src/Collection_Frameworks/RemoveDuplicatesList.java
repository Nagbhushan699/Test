package Collection_Frameworks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesList {

	public static void main(String[] args) {
		List<String>Mobiles=new ArrayList<String>();
		Mobiles.add("Vivo");
		Mobiles.add("Realme");
		Mobiles.add("LENOVO");
		Mobiles.add("Sony");
		Mobiles.add("Vivo");
		Mobiles.add("Sony");
		for(String mobileNames:Mobiles) {
			System.out.println(mobileNames);
		}
		Set<String>s=new HashSet<String>(Mobiles);
		
		System.out.println(s);

	}

}
