package Capgemini_Questions;

public class EXception_Ex {

	public static void main(String[] args) {
		String str=null;
		try {
			str.equals("Java");
		}
		catch(NullPointerException e) {
			str=new String("Java");
			System.out.println(str.equals("Hello"));
		}
		System.out.println("Program continues");

	}

}
