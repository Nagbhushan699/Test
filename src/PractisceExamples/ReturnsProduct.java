package PractisceExamples;

public class ReturnsProduct {
     public int product(int a,int b) {
    	 int c=a*b;
    	 return c;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnsProduct obj=new ReturnsProduct();
		int res=obj.product(20, 52);
		System.out.println(res);
	}

}
