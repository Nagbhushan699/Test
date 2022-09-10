package PractisceExamples;

public class StringMethods {

	public static void main(String[] args) {
//			System.out.println(s.indexOf("my"));
//		System.out.println(s.indexOf('i', 4));
//		System.out.println(s.toUpperCase());
//		System.out.println(s.replace("is", "was"));
//		System.out.println(s.replaceFirst("was", "is"));
//		System.out.println(s.replaceAll("is", "was"));
////		SystemString s="This was my home";
//		System.out.println(s.indexOf('i'));
	   String s="This was my new Home";
	   System.out.println(s.substring(s.indexOf("was")+4,s.indexOf("new")-1));
	   System.out.println(s.substring(s.indexOf("my")+3, s.indexOf("Home")-1));
	   String e="This is your order Id :12356";
	   System.out.println(e.substring(e.indexOf(":")+1,e.length()));
	   String w="your order 2313 is generated successfully";
	   System.out.println(w.substring(w.indexOf("order")+6,w.indexOf("is")-1));
	   String s1="Bhushan";
	   s1=s1+"Bhalerao";
	   System.out.println(s1);
	   String s2=new String("Bhushan");
	   String s3=new String("Bhushan");
	   System.out.println(s1.equals(s2));
	   System.out.println(s1==s2);
	   System.out.println(s2==s3);
	   

	}

}
