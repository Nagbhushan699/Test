package Assignments;
//Define a method to find out if number is prime or not
public class methods_ex7 {
int a;
int check=0;
void prime(int a)
{
	this.a=a;
	for(int i=2;i<a-1;i++)
	{
		if(a%i==0)
		{
			check++;
		}
	}
	if(check==0)
	{
		System.out.println(a+ " is a prime number");
	}
	else
	{
		System.out.println(a+ " is not  a prime number");
	}
}
	public static void main(String[] args) {
		methods_ex7 obj=new methods_ex7();
		obj.prime(10);

	}

}
