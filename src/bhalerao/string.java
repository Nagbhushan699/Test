package bhalerao;

public class string {

	public static void main(String[] args) {
		try {
		 int a[]=new int[5];
		
		 System.out.println(a[6]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		finally {
		System.out.println("i love you");
		}
	}

}
