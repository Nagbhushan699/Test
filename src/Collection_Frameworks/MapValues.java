package Collection_Frameworks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MapValues {
	//6. WAP to check if values is present in the map
	public static void main(String[] args) {
		Map<Integer,String>	car=new HashMap<Integer,String>();
        car.put(1, "Alto");
        car.put(2, "Nissan");
        car.put(3, "Nano");
        car.put(4, "Scorpio");
        car.put(5, "Omini");
        Scanner scn=new Scanner(System.in);
        Iterator<Integer>itr=car.keySet().iterator();
        System.out.println("Enter Value : ");
          System.out.println(car.containsValue(scn.next()));
  
          }

	}


