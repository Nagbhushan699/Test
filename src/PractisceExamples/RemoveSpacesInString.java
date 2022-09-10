package PractisceExamples;

public class RemoveSpacesInString {

	public static void main(String[] args) {
	String s="  Helllo         World  ";
	System.out.println(s.replaceAll(" ", ""));
	System.out.println(s.trim());
	String s1="I am Happy today";
	System.out.println(s1.charAt(0));
	System.out.println(s1.charAt(s1.length()-1));
	System.out.println(s1.contains("am"));
	String n="Bhalerao Nagbhushan";
	for(int i=n.length()-1;i>=0;i--) {
		System.out.print(n.charAt(i));
	}
	}

}
