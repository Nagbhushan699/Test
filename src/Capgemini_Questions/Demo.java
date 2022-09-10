package Capgemini_Questions;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
	public static void before() {
		Set set=new TreeSet();
		set.add("2");
		set.add("3");
		set.add("1");
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
	}

	public static void main(String[] args) {
	Demo.before();

	}

}
