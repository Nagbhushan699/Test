package Harikrishna_Programs;

public class Arrays_Parameter {
	
	static void show(int a[]) {
//		for(int i =0;i<a.length;i++) {
//			System.out.println("a["+i+"] : "+a[i]);
//		}
		System.out.println(java.util.Arrays.toString(a));
	}
	static int []m2(){
	 int i []= {2,4,5};
		return i;
	}
	
	public static void main(String[] args) {
        int a1[]= {12,34,46};
        int a2[]= {12,34};
        int a3[]= {12,34,46,78};
        int a4[]= {34};
		show(a1);
		show(a2);
		show(a3);
		show(a4);
		int j []=m2();
	    System.out.println(java.util.Arrays.toString(j));

	}
}
