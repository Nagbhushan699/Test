package ExceptionHandling;

public class ExceptionThrow {
	public void m1(int a) {
		try {
		if(a<0) {
		   System.out.println("Please pass positive value");
		}
		else {
			System.out.println("Congratulation!");
		}
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println("I love you");
	}
	public static void main(String[] args) {
		ExceptionThrow obj=new ExceptionThrow();
		obj.m1(-1);

	}

}
