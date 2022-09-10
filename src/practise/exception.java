package practise;

public class exception {
	void add()
	{
		int a=9,b=0,c;
		c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
	
		try {
			exception ob=new exception();
		ob.add();
		}
		catch(Exception e) {
				e.printStackTrace();
			}
		System.out.println("geeta");
		}

	}


