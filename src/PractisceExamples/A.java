package PractisceExamples;

import java.util.ArrayList;

public class A {
	ArrayList<String>a;
    public A(ArrayList<String>a) {
    	this.a=a;
    	for(String r:a) {
    		System.out.println(r);
    	}
    }
	public static void main(String[] args) {
	ArrayList<String>vf=new ArrayList<String>();
	vf.add("Bhushan");
	vf.add("karan");
	A ob=new A(vf);
	
	
 
	}

}
