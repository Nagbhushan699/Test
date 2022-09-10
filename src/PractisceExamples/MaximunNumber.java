package PractisceExamples;

public class MaximunNumber {
public void maxNum(int a,int b,int c) {
	if(a>b && a>c) {
		System.out.println(a+" is greatest");
	}
	else if(b>c) {
		System.out.println(b+" is greatest");
	}
	else {
		System.out.println(c+ " is greatest");
	}
}
public void minNum(int a,int b,int c) {
	if(a<b && a<c) {
		System.out.println(a+" is Lowsest");
	}
	else if(b<c) {
		System.out.println(b+" is Lowsest");
	}
	else {
		System.out.println(c+ " is Lowsest");
	}
}
	public static void main(String[] args) {
		MaximunNumber obj=new MaximunNumber();
		obj.maxNum(20, 50, 60);
		obj.minNum(20, 10, 90);

	}

}
