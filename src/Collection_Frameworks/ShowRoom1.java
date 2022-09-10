package Collection_Frameworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
//4.write a program to check element is present in the list or not
public class ShowRoom1{
   
	public static void main(String[] args) {
		List<String>bikes=new ArrayList<String>();
		bikes.add("Honda");
		bikes.add("FZ");
		bikes.add("Maruti");
		bikes.add("Apache");
		Scanner scn=new Scanner(System.in);	
		 Iterator<String>itr=bikes.iterator();
		 System.out.println("Enter your bike name ");
           System.out.println(bikes.contains(scn.next()));
		
	}

}
