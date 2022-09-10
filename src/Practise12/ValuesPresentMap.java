package Practise12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ValuesPresentMap {

	public static void main(String[] args) {
	Map<Integer,String>friends=new HashMap<Integer,String>();
	friends.put(1,"Karan");
	friends.put(2,"Bhushan");
	friends.put(3,"Ram");
	friends.put(4,"Amol");
	Iterator<Integer>itr=friends.keySet().iterator();
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter Values : ");
	System.out.println(friends.containsValue(scn.next()));
	
	
	
	
	}

}
