package practise;

public class encapsulation_ex2 {
	private int a,b,c;
	
 public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
void show()
 {
	 c=a+b;
	 System.out.println("the sum of two numbers is : "+c);
 }
public static void main(String[] args) {
	encapsulation_ex2 obj=new encapsulation_ex2();
 obj.setA(10);
 obj.setB(20);
 obj.show();
}
}