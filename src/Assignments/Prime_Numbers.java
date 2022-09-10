package Assignments;

public class Prime_Numbers {
	
	int check=0;
	void primeno(int no) {
		for(int i=2;i<no-1;i++)
		{
			if(no%i==0)
			{
				check++;
			}
		}
		if(check==0)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime no");
		}
	}

	public static void main(String[] args) {
		Prime_Numbers obj=new Prime_Numbers();
		obj.primeno(3);

	}

}
