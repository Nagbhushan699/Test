
public class enxapsulation_ex4 {
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
public void show() {
	c=a+b;
	System.out.println("the sum of two numbers"+c);
}
public void disp() {
	c=a*b;
	System.out.println("the multi of two numbers"+c);
}
	

}
