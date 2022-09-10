import java.util.Scanner;

public class single_dimensional_array {

	public static void main(String[] args) {
		int a[]=new int[5];
		System.out.println("enter array elements");
		Scanner obj=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=obj.nextInt();
		}
          for(int c:a)
          {
        	  System.out.println("array elements are"+" "+c); 
          }
	}

}
