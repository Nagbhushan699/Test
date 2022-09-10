package practise;

public class ArrayEx {
	
    public static void add(int []a) {
    	int sum=0;
    	for(int i=0;i<a.length-1;i++) {
    		sum=(a[i]+5);
    		System.out.println("sum : "+sum);
    	}
    
    }
	public static void main(String[] args) {
	   int a[]=new int[4];
	   a[0]=10;
	   a[1]=20;
	   a[2]=30;
	   a[3]=40;
	   add(a);
	  

	}

}
