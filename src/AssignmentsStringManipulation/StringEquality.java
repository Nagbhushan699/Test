package AssignmentsStringManipulation;

public class StringEquality {

	public static void main(String[] args) {
 //write a program to check two diffrent strings equality
       String str1="Hello World";
       String str2="Hello Java";
       String str3=new String("Hello Java");
       System.out.println(str1.equals(str2));
       System.out.println(str1==str2);
       System.out.println(str2.equals(str3));
       System.out.println(str2==str3);
	}

}
