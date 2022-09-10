package bhalerao;

public class Assignment_7 {

	public static void main(String[] args) {
		//wap to identify if number is a prime number
		int no=3;
		int check=0;
		for(int i=2; i<no-1;i++)
		{
			if(no%i==0)	
			{
				check++;
			}
		}
		if(check==0)
		{
			System.out.println(no+" "+"is a prime number");
		}
		else
		{

			System.out.println(no+ " "+"is not  a prime number");
		}


	}

}
