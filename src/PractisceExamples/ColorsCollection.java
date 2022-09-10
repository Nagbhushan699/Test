package PractisceExamples;

import java.util.ArrayList;

public class ColorsCollection {

	public static void main(String[] args) {
		ArrayList <String>colors=new ArrayList<String>();
		colors.add("White");
		colors.add("Black");
		colors.add("Red");
		colors.remove(2);
		colors.add(2,"Blue");
		for(String s:colors) {
			System.out.println("Colors : "+s);
		}
		for(int i=0;i<colors.size()-1;i++) {
			System.out.println(colors.get(i));
		}

	}

}
