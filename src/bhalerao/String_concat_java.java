package bhalerao;

public class String_concat_java {

	public static void main(String[] args) {
		String s="Nagbhushan";
		String s2="Bhalerao";
		String s3="100";
		System.out.println(s+s2);   //NagbhushanBhalerao
        System.out.println(s+s2+s3);  //NagbhushanBhalerao100
        int a=10;
        int b=20;
        System.out.println(a+b+s+s2);  //30NagbhushanBhalerao
        System.out.println(s+s2+a+b);  //NagbhushanBhalerao1020
        System.out.println(s+a+s2+b);  //Nagbhushan10Bhalerao20
        System.out.println(a+b);  //30
        System.out.println("the sum of two numbers is : "+a+b);  //the sum of two numbers is : 1020
        System.out.println("the sum of two numbers is : "+(a+b)); //the sum of two numbers is : 30
         double c=20.55;
         double d=50.000;
         System.out.println(c+d);   //70.55
         System.out.println("the sum of two numbers is"+c+d);   //the sum of two numbers is20.5550.0s
	}

}
