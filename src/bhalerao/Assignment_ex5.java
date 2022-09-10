package bhalerao;

public class Assignment_ex5 {

	public static void main(String[] args) {
		//WAP to findout maximum number from given positive numbers
		int a=10,b=20,c=50,d=40;
		if(a>b && a>c && a>d)
		{
			System.out.println(" maximum number is : "+a);
		}
		else if( b>c && b>d)
		{
			System.out.println(" maximum number is : "+b);
		}
		else if(c>d)
		{
			System.out.println(" maximum number is : "+c);
		}
		else
		{
			System.out.println(" maximum number is : "+d);
		}

	}

}
