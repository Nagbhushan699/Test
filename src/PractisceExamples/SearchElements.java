package PractisceExamples;

import java.util.ArrayList;

public class SearchElements {
	

	public static void main(String[] args) {
       ArrayList obj=new ArrayList();
       obj.add("Bhalerao");
       obj.add(20);
       obj.add("Bhushan");
       if(obj.contains("Bhushanrr")) {
    	   System.out.println("getta");
       }
       else {
    	   System.out.println("elements is not present");
       }
	}

}
