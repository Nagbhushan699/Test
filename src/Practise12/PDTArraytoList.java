package Practise12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class PDTArraytoList {

	public static void main(String[] args) {
		String s="I am learing java coding";
		String s1[]=s.split(" ");
//		List<String>s3=Arrays.asList(s1);
		List<String>s3=new ArrayList<String>();
     for(int i=0;i<s1.length-1;i++) {
          s3.add(s1[i]);
     }
     Collections.swap(s3, 0, 1);
     System.out.println(s3);
int []a= {10,20,30,40,50};
Set<Integer>nos=new TreeSet<Integer>();
for(int i=0;i<a.length;i++) {
	nos.add(a[i]);
}
System.out.println(nos.toString());
Iterator<Integer>itr=nos.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
for(Integer num:nos) {
	System.out.println(num);
}
}
}
