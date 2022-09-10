package bhalerao;

public class increment_operator {

	public static void main(String[] args) {
		//post increment
//	   int a=10;
//	  int b=a++;  
//	  System.out.println(a);  //11
//	  System.out.println(b);  //10
//	  System.out.println(a); //11
//	  int c=20;
//	 int d=c++;
//	   System.out.println(c); //21
//	   System.out.println(d);  //20
	   //pre increment
		int a=10;
		int b=++a;
		System.out.println(a);  //11
		System.out.println(b);  //11
		//post decrement
		int r=20;
		int s=r--;
		System.out.println(r);  //19
		System.out.println(s);  //20
		//pre decrement
		int y=15;
		int z=--y;
		System.out.println(y);  //14
		System.out.println(z);   //14
		//increment
		int p=10;
		System.out.println(p++);  //10
		System.out.println(p);   //11
		System.out.println(++p);  //12
		System.out.println(p);  //12
		// decrement
		int e=20;
		System.out.println(e--);   //20
		System.out.println(e);    //19
		System.out.println(--e);  //18
		System.out.println(e);  //18
	   
	   

	}

}
