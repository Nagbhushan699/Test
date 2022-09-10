package Capgemini_Questions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collection {
	
	static boolean var;
Collection(boolean var) {
		var=true;
	}
public static void test1() {
	
	 Set<Integer>itr=new TreeSet<>();
     itr.add(2);
     itr.add(3);
     itr.add(1);
     Iterator<Integer>itr1=itr.iterator();
     while(itr1.hasNext()) {
    	 System.out.println(itr1.next());
     }
     
}
	public static void main(String[] args) {
//		String s[]= {"One","Two","Three","Four","Four","Five"};
////		int e[]= {1,2,3,4};
//        List<String>tmp=Arrays.asList(s);
////        for(int i=0;i<tmp.size()-1;i++) {
////        	System.out.println(tmp.get(i));
////        }
//        TreeSet<String>str=new TreeSet<String>(tmp);
//        System.out.println(str);
////        Iterator<String>itr=str.iterator();
////        while(itr.hasNext()) {
////        	System.out.println(itr.next());
////        }
//        TreeSet<Integer>itr=new TreeSet<>();
//        itr.add(10);
//        itr.add(8);
//        itr.add(15);
//        itr.add(1);
//        System.out.println(itr);
//        String name="aravind";
//        int po=name.replace('a','*').substring(2, 4).indexOf('i');
//        System.out.println(po);
//        String str1="abc";
//        String str2="def";
//        String str3=str1.concat(str2);
//        str1.concat(str2);
//        System.out.println(str1);
        new Collection(var);
//        Collection.test1();
        System.out.println(Collection.var);
	}

}
