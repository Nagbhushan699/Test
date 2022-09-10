
public class String_ex1 {

	public static void main(String[] args) {
	  
	 /*String str2= str.concat("bhalerao");  */ 
	   String str="bhushan";  
	   String str2="bhalerao";
	   String str3="bhalerao is happy is ";
		   System.out.println(str2.compareToIgnoreCase(str));   
		   System.out.println(str+str2+10); 
		    System.out.println(str.join(";",str,str2,str3)) ;
		    System.out.println(str.subSequence(2,5)) ;  //ush;
		    System.out.println(str2.subSequence(2,5)) ;  //ale;
		    System.out.println(str.substring(2));
		    System.out.println(str2.substring(2));
		    System.out.println(str3.replaceFirst("is", "was"));
		    System.out.println(str3.replaceAll("is", "was"));
	}

}
