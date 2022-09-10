package Practise12;
import java.util.ArrayList;
public class names {

	public static void main(String[] args) {
	 ArrayList<Integer> obj=new ArrayList<Integer>();
	 obj.add(20);
	 obj.add(35);
	 obj.add(50);
	 
//	 obj.add("bhushan");
//	 obj.add("karan");
//	 obj.add("vaibhav");
	 obj.remove(obj.size()-1);
	 for(int e:obj) {
		 System.out.println(e);
	 }
	 for(int i=0;i<=obj.size()-1;i++) {
		 System.out.println(obj.get(i));
	 }

	}

}
