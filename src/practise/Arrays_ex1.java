package practise;

public class Arrays_ex1 {

	public static void main(String[] args) {
	/* int a=25,b=78,c=87;
	 if(a>b && a>c)
	 {
		 System.out.println("The greatest : "+ a);
	 }
	 else if(b>c)
	 {
		 System.out.println("The greatest : "+ b);
	 }
	 else
	 {
		 System.out.println("The greatest : "+ c);
	 } */
		/*for(int i=0;i<10;i++)
		{
			System.out.println("I am batman : "+ i);
		}*/
	/*for(int i=10;i>=1;i--)
	{
		System.out.println(i);
	}*/
		/*int i=10;
		while(i>=1)
		{
		
			System.out.println(i);
			i--;
		}*/
		/*int i=10;
		do {
			System.out.println(i);
			i--;
		}
		while(i>=1);*/
		/*int i=1;
		while(i<=10)
		{
			System.out.println("Hello World");
			i++;
		}*/
		int no=7;
		int chec=0;
		for(int i=2;i<=no-1;i++)
		{
			if(no%i==0)
			{
				chec++;
				
			}
		}
		if(chec==0)
		{
			System.out.println(no+ " is a prime no");
		}
		else
		{
			System.out.println(no+" is not a prime no");
		}

	}

}
