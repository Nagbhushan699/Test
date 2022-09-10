package Collection_Frameworks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MapKeyPresent {
//5. WAP to check if key is present in the map
	public static void main(String[] args) {
		Map<Integer,String>colors=new HashMap<Integer,String>();
         colors.put(1, "Blue");
         colors.put(2, "Black");
         colors.put(3, "Green");
         colors.put(4, "Yellow");
         colors.put(5, "Blue");
         Scanner scn=new Scanner(System.in);
         Iterator<Integer>itr=colors.keySet().iterator();
         System.out.println("Enter key : ");
           System.out.println(colors.containsKey(scn.nextInt()));
   
           }
	}


