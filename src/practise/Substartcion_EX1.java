package practise;

public class Substartcion_EX1 {
public static int sub(int a, int b)throws IllegalArgumentException{
	if(a<0 || b<0) {
		throw new IllegalArgumentException("please pass the non-negative value");
	
	}
	else {
		return a-b;
	}
}
}
