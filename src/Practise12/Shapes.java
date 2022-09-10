package Practise12;

public class Shapes {
	public static int findAreaOfRec(int a,int b) {
		int c=a*b;
		return c;
	}
	public static int findAreaOfSquare(int a) {
		int c=a*a;
		return c;
	}
	public static void findAreaOfTriangle(int b,int h) {
		int c=(b*h);
		System.out.println("Area of Triangle is : "+c);
	}

	public static void main(String[] args) {
		int res=findAreaOfRec(10,20);
		int res1=findAreaOfSquare(20);
		findAreaOfTriangle(10,36);
		System.out.println("The area of rectangle is : "+res+" sqm");
		System.out.println("The area of square is : "+res1+" sqm");
	}

}
