
public class encapsulation_ex1 {
	private int a;
	private String b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	void show()
	{
		System.out.println(this.a);
		System.out.println(this.b);
	}

}
