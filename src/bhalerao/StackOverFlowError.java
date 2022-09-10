package bhalerao;

public class StackOverFlowError {
	public static void m1(int a) {
		System.out.println(a);
		if(a==0)
			return;
		else
			m1(++a);
	}
	

	public static void main(String[] args) {
		StackOverFlowError obj=new StackOverFlowError();
		obj.m1(0);

}
