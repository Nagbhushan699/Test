package Capgemini_Questions;

public class EX1 {
	private int num;
	public EX1(int num) {
		num=num;
	}
	protected int getNum() {
		return num;
	}

	public static void main(String[] args) {
		EX1 obj=new EX1(10);
		System.out.println(obj.getNum());

	}

}
