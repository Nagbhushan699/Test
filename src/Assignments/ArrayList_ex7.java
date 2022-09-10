package Assignments;

import java.util.ArrayList;

public class ArrayList_ex7 {

	public static void main(String[] args) {
		//WAP to print all the elements of an arraylist using the position of the elements
	    ArrayList mobile_data=new ArrayList();
	    mobile_data.add("Vivo");
	    mobile_data.add("Octacore");
	    mobile_data.add(5000);
	    mobile_data.add(128);
	    for(int i=0;i<=mobile_data.size()-1;i++)
	    {
	    	System.out.println( mobile_data.get(i));
	    }
	    
	}

}
