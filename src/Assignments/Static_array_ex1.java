package Assignments;

public class Static_array_ex1 {

	public static void main(String[] args) {
		//Create a integer array of 10 elements,insert values in array and find the addition of all elements
		int sum=0;
		int a []= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<10;i++)
		{
			 sum=sum+a[i];				
		}
		System.out.println("Addition of all elements is : "+sum);

	}

}
