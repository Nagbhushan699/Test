package PractisceExamples;

public class SubString {

	public static void main(String[] args) {
		String s1="I am happy with you";
		System.out.println(s1.substring(s1.length()/2));
		System.out.println(s1.substring(s1.length()/2-4,s1.length()/2+1));
		String s="It has been raning since morning";
		System.out.println(s.substring(s.length()/2));
		System.out.println(s.substring(s.length()/2-4, s.length()/2+2));
        System.out.println(s.charAt(s.lastIndexOf('e')));
        String e="I am happy";
        System.out.println(e.substring(2, 4));
        System.out.println(e.lastIndexOf("hi"));
        String []res=e.split(" ");
        for(String p:res) {
        	System.out.println(p);
        }
        String m="My Transaction id is : 12356";
         String n=m.replaceAll("[^0-9]","");
         System.out.println(n);
	}

}
