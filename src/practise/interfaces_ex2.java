package practise;

interface interfaces_ex2 {
	
	void add1(int a,int b);
}
class byt implements interfaces_ex2{
	
	public int  add(int a,int b) {
		int c=a+b;
		return c;
	}
	void multi()
	{
		int n=16,t=50,v;
		v=n*t;
		System.out.println("multiplication of two numbers is : "+v);
		
	}
	public static void main(String[] args) {
		byt obj=new byt();		
int result =obj.add(100, 26);
System.out.println("the sum of two numbers is : "+result);
obj.multi();
	}

}
