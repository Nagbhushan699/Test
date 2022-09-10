
public class string_ex12 {

	public static void main(String[] args) {
		String str="Bhushan is happy is";
		String str2="bhushan"; 
		int a=10;
		String sr=String.valueOf(a);
		System.out.println(sr);
		 System.out.println(str.replaceAll("is","was"));
		 System.out.println(str2.indexOf("h"));
		 System.out.println(str2.lastIndexOf("a"));
		 System.out.println(str2.subSequence(2,5));
		 System.out.println(str2.contains("a"));
		 System.out.println(str2.substring(2));
		 System.out.println(str2.startsWith("nt"));
		 System.out.println(str2.charAt(2));
		 System.out.println(str2.toUpperCase());
		 System.out.println(str2.join(";",str,str2));
		 System.out.println(str2.isEmpty());
		 

	}

}
