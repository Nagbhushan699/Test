package practise;

public class Exception_Addition {
	public static int add(int a,int b)throws IllegalArgumentException{
		if(a<0 || b<0) {
			throw new IllegalArgumentException(
					"please pass positive value ");
		}
		else {
			return a+b;
		}
	}
}
