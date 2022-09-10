package Collection_Frameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Q.4 Create two list and find elements which are not common and create a list
public class NonCommonElemtentsList {

	public static void main(String[] args) {
		List<String>colorsList1=new ArrayList<String>();
		colorsList1.add("Red");
		colorsList1.add("Blue");
		colorsList1.add("White");
		colorsList1.add("Black");
		colorsList1.add("Brown");
		System.out.println("colorsList 1 : "+colorsList1);
		List<String>colorsList2=new ArrayList<String>();
		colorsList2.add("Pink");
		colorsList2.add("Grey");
		colorsList2.add("Blue");
		colorsList2.add("Green");
		colorsList2.add("Black");
		colorsList2.add("White");
	    System.out.println("colorsList 2 : "+colorsList2);
		List<String>colorsList3=new ArrayList<String>();
		colorsList3.addAll(colorsList1);
		colorsList3.removeAll(colorsList2);
		List<String>colorsList4=new ArrayList<String>();
		colorsList4.addAll(colorsList2);
		colorsList4.removeAll(colorsList1);
		List<String>colorsList5=new ArrayList<String>();
		colorsList5.addAll(colorsList3);
		colorsList5.addAll(colorsList4);
		System.out.println("Uncommon Elements : "+colorsList5);
		}


	}


