import java.util.Scanner;

public class second_dim_array {

	public static void main(String[] args) {
		 int a[][]= new int[4][4];
		 System.out.print("enter array elements");
		 Scanner obj=new Scanner(System.in);
		 for(int i=0;i<4;i++)
		 {
			for(int j=0;j<4;j++) 
			{
				a[i][j]=obj.nextInt();
			}			 
		 }
		 for(int i=0;i<4;i++)
		 {
			for(int j=0;j<4;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			 System.out.println();
		 }	
		
	}

}
