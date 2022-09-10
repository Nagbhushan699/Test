package Harikrishna_Programs;

public class FloatingArray {
	public int[] array(int e[]) {
		return e;
	}

	public static void main(String[] args) {
		double []a= {10.66,2.66,2.06,25};
		System.out.println(java.util.Arrays.toString(a));
		for(int i=0;i<a.length-1;i++) {
			System.out.println("a["+i+"] : "  +a[i]);
		}
		FloatingArray obj=new FloatingArray();
		int re[]=obj.array(new int[] {10,20,30,40});
		System.out.println(java.util.Arrays.toString(re));

	}

}
