package AssignmentsStringManipulation;

import java.util.Arrays;

public class BreakString {

	public static void main(String[] args) {
//WAP that breaks a whole string into small strings and prints its values
		String s1="I,have,completed,civil,engineering,in";
		String[]str=s1.split(",");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	/* Scanner sc=new Scanner(s1);
    while(sc.hasNext()) {			
		String tokens=sc.next();
 	System.out.println(tokens);*/
//		}
//		System.out.println(s1.substring(0,1));
//		System.out.println(s1.substring(2,6));
//		System.out.println(s1.substring(7,17));
//		System.out.println(s1.substring(17,23));
//		System.out.println(s1.substring(23,34));
		String s3="I am fine";
		System.out.println(Arrays.toString(s3.split(" ")));
	}

}

