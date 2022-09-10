package Harikrishna_Programs;

public class MethodOverloading {
  static void add(int a,int b) {
	  int c=a+b;
	  System.out.println("Addition : "+c);
  }
  static void add(int a,int b,int c) {
	  int d=a+b+c;
	  System.out.println("Addition : "+d);
  }
  void mul(int a,int b) {
	  int c=a*b;
	  System.out.println("Multiplication : "+c);
  }
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		MethodOverloading obj=new MethodOverloading();
		obj.mul(25, 2);
	}

}
