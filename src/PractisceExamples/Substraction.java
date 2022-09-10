package PractisceExamples;

import java.util.Scanner;

public class Substraction {
     public  void sub(int a,int b)throws Exception {
    	 if(a<0 || b<0) {
    		 throw  new Exception("please pass postive alue");
    	 }
    	 else {
    		 int c= a-b;
    		 System.out.println("Substraction : "+c);
    	 }
     }
	public static void main(String[] args) {
		Substraction obj=new Substraction();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values : ");
		try {
			obj.sub(sc.nextInt(), sc.nextInt());
		}
		catch(Exception e) {
			System.out.println("Error : "+e.getMessage());
		}

	}

}
