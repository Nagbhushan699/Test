package Practise12;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class KeyPresentMap {

	public static void main(String[] args) {
		Map<String,String>colors=new TreeMap<String,String>();
          colors.put("B", "Blue");
          colors.put("Y", "Yellow");
          colors.put("P", "Pink");
          colors.put("Y", "YellowBrown");
          Iterator<String>itr=colors.keySet().iterator();
          while(itr.hasNext()) {
        	 System.out.println(colors.get(itr.next()));
          }
          Scanner scn=new Scanner(System.in);
          System.out.println("Enter key : ");
          System.out.println(colors.containsKey(scn.next()));
	}

}
