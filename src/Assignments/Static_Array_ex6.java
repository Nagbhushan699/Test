package Assignments;

public class Static_Array_ex6 {

	public static void main(String[] args) {
		//create an integer array and find smallest number.
		int a[]= {10,20,30,40,50};
		int min=a[0];                    //suppose minimum number is min =a[0];min=10;
	    for(int i=1;i<a.length;i++)
	    {
	    	if(a[i]<min)                 //a[1]=20;20<10;min=10;
	    	{                            //a[2]=30;30<10;min=10;
	    		min=a[i];                //a[3]=40;40<10;min=10;
	    	}                            //a[4]=50;50<10;min=10;
	    }
	    System.out.println("smallest number in an array is : "+min);
	}

}
