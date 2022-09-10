package Assignments;
//define two methods to print the maximum and minimum number respectively among 
//three numbers entered by user
public class methods_ex4 {
int a,b,c;
void maximum(int a, int b,int c)
{
	 this.a=a;
	 this.b=b;
	 this.c=c;
  if(a>b && a>c)
  {
	  System.out.println(a+" is maximum number");
  }
  else if(b>c)
  {
	  System.out.println(b+" is maximum number"); 
  }
  else
  {
	  System.out.println(c+" is maximum number ");
  }
}
void minimum(int a, int b,int c)
{
	 this.a=a;
	 this.b=b;
	 this.c=c;
  if(a<b && a<c)
  {
	  System.out.println(a+" is minimum number");
  }
  else if(b<c)
  {
	  System.out.println(b+" is minimum number"); 
  }
  else
  {
	  System.out.println(c+" is minimum number ");
  }
}
	public static void main(String[] args) {
		methods_ex4 obj=new methods_ex4();
		obj.maximum(10, 20, 30);
		obj.minimum(10, 20, 30);

	}

}
