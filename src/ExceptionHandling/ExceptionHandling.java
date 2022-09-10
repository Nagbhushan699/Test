package ExceptionHandling;

public class ExceptionHandling {
	public void m1(int a)throws IllegalArgumentException {
		if(a<0) {
			throw new IllegalArgumentException("please pass positive value");
		}
		else {
			System.out.println("Congratulation!");
		}
	}

	public static void main(String[] args) {
		ExceptionHandling obj=new ExceptionHandling();
		try {
			obj.m1(-1);
		}
		catch(IllegalArgumentException e) {
			System.out.println("error : "+e.getMessage());
		}

	}

}
