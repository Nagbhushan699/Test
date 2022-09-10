package Collection_Frameworks;

import java.util.*;

public class Colors {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
        list.add("Blue");
        list.add("Red");
        list.add("White");
        list.add("Black");
//        for(int i=0;i<=list.size()-1;i++) {
//        	System.out.println(list.get(i));
//        }
        Iterator itr=list.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
	
		}
	}




