package encapsulation;

public class A {
	String s;

	public static void main(String[] args) throws Exception {
		A ob=new A();
//		ob=null;
		int a[]=new int[4];
		try {
	System.out.println("Hii...");
	    a[5]=205;
		}
		catch(ArrayIndexOutOfBoundsException r) {
			r.printStackTrace();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
//    System.out.println(a/0);
    System.out.println("Hello");
    ob.s="bhsuhan";
    System.out.println(ob.s);
      }
	
	

}

