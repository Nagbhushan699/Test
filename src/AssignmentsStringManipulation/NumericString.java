package AssignmentsStringManipulation;

public class NumericString {

	public static void main(String[] args) {
/*WAP get only numeric part from this string : string s="your transaction id is : 1234 and
		reference id is : 34567*/
		String s="your transactions id is :1234 and reference id is :34567";
		String numbers=s.replaceAll("[^0-9]", "");
		System.out.println(numbers);
		int value=Integer.parseInt(s.replaceAll("[^0-9]",""));
		System.out.println(value);
//		System.out.println(s.substring(25,29));
//		System.out.println(s.substring(51,56));
		String str=" my id : 2345366";
		int value1=Integer.parseInt(str.replaceAll("[^0-9]",""));
		System.out.println(value1);
		System.out.println(str.replaceAll("[^0-9]",""));
		
	}

}
