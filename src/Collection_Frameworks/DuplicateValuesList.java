package Collection_Frameworks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateValuesList {
//7.WAP to check duplicate values present in the List
	public static void main(String[] args) {
	List<String>LaptopNames=new ArrayList<String>();
	LaptopNames.add("HP");
	LaptopNames.add("ASUS");
	LaptopNames.add("LENOVO");
	LaptopNames.add("DELL");
	LaptopNames.add("HP");
	LaptopNames.add("DELL");

    Set<String>s=new HashSet<>();
     for(String Laptops:LaptopNames) {
    	 if(s.remove(Laptops)==false)
   		 System.out.println(Laptops);
   }
 
   	}


}

