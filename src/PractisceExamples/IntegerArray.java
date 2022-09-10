package PractisceExamples;

import java.util.ArrayList;

public class IntegerArray {

	public static void main(String[] args) {
	  ArrayList elements=new ArrayList();
	  elements.add("Bhushan");
	  elements.add(10);
	  elements.add(80);
	  elements.remove(0);
	  elements.add(" Karan");
	  elements.remove(elements.size()-1);
	  elements.add(8996);
	 for(int i=0;i<elements.size()-1;i++) {
		 System.out.println("colors["+i+"] : "+elements.get(i));
	 }

	}

}
