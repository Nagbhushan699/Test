package Collection_Frameworks;

import java.util.ArrayList;
import java.util.List;

//Q.3 Create a two list,find common elements from two list and create third list
public class CommonElements {

	public static void main(String[] args) {
	List<String>ContactList1=new ArrayList<String>();
	ContactList1.add("Karan");
	ContactList1.add("Vaibhav");
	ContactList1.add("Ram");
	ContactList1.add("Kiran");
	ContactList1.add("Sangam");
	ContactList1.add("Akash");
	System.out.println("ContactList1 : "+ContactList1);
	List<String>ContactList2=new ArrayList<String>();
	ContactList2.add("Nikhil");
	ContactList2.add("Vaibhav");
	ContactList2.add("Ram");
	ContactList2.add("Nitin");
	ContactList2.add("Sangam");
	ContactList1.add("Gagan");
    System.out.println("ContactList2 :"+ContactList2);
	List<String>ContactList3=new ArrayList<String>();
	ContactList3.addAll(ContactList1);
	ContactList3.retainAll(ContactList2);
	System.out.println("Common elemnts : "+ContactList3);
	}

}
