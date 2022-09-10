package Capgemini_Questions;

public  class Ex122 {
	private int num;
	public Ex122(int num) {
		num =num;
	}
	public int getNum() {
		return num;
	}
	public static void main(String[]args) {
		Ex122 obj=new Ex122(10);
		System.out.println(obj.getNum());
	}
}
