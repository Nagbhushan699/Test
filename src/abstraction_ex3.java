
abstract public class abstraction_ex3 {
	public abstract void add();
	public void show() {
		int a=10;int b=20;
		int c=a+b;
		System.out.println("the sum of two numbers is :"+c);
	}
}
class lerao extends abstraction_ex3{
	public void add() {
		int a=50;int b=20;
		int c=a*b;
		System.out.println("the multi of two numbers is :"+c);	
}
	public static void main(String[] args) {
		lerao obj=new lerao();
		obj.show();
		obj.add();
			

	}

}
