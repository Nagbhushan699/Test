package Assignments;

public class Static_Array_ex4 {

	public static void main(String[] args) {
		//create integer array and find second largest number in an array.
		int a[]= {1,4,5,15};
		int check;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])                  //a[0]=1;a[j]or a[1]=4;1<4;true;check=1;a[0]=4;a[1]=1;
				{                             //a[1]=4;a[j]or a[2]=5;4<5;true;check=4;a[1]=5;a[2]=4;
					check=a[i];               //a[2]=5;a[j]or a[3]=15;5<15;true;check=5;a[3]=15;a[2]=5;
					a[i]=a[j];
					a[j]=check;
				}
			}
		}
		System.out.println("second largest number in an array is : "+a[1]);

	}

}
