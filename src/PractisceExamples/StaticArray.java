package PractisceExamples;

public class StaticArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
        for(int i=0;i<=a.length-1;i++) {
        	System.out.println(a[i]);
        }
        Object e[]=new Object[4];
        e[0]="Bhushan";
        e[1]=23;
        e[2]='M';
        e[3]=20.05;
        for(Object r:e) {
        	System.out.println(r);
        }
	}

}
