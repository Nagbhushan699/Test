package Assignments;

public class Static_array_ex3 {

	public static void main(String[] args) {
	//create integer array and find largest number in an array
		int a[]= {10,15,20,30,50};
		int max=a[0];                    //suppose maximum value is a[0]=10;
     for(int i=1;i<a.length;i++)
     {
    	 if(a[i]>max)                    //a[1]=15;15>10;max=15;
    	 {                               //a[2]=20;20>15;max=20;
    		 max=a[i];                   //a[3]=30;30>20;max=30;
    	 }                              //a[4]=500;50>30;max=50;
     }
     System.out.println("largest number in an array is : "+max);
	}

}
