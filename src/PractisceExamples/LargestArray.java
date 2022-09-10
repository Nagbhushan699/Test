package PractisceExamples;

public class LargestArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
        int num=a[0];
        for(int i=0;i<=a.length-1;i++) {
        	if(a[i]<num) {
        		num=a[i];
        	}
        }
    		System.out.println(num +" is the lowest");
    	
	}

}
