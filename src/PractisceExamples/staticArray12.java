package PractisceExamples;

import java.util.Arrays;

public class staticArray12 {
	int []a;
	public static int add(int a[]) {
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==10) {
			  break;
			}
			System.out.println("a["+i+"] : "+a[i]);
		}
		return 50;
	}
	public static void main(String[] args) {
		int b[]= {20,30,40,50};
		java.util.Arrays.toString(b);
		int res=add(b);
		System.out.println("Result : "+res);

	}

}
