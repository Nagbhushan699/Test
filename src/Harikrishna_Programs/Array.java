package Harikrishna_Programs;
public class Array  {

	public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
		try {
		int a[]=new int[5];
		a[0]=1;
		a[1]=10;
		a[2]=11;
		a[3]=12;
		a[4]=15;
		System.out.println(java.util.Arrays.toString(a));
		for(int i=0;i<a.length-1;i++) {
			System.out.println("a["+i+"] : "+a[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("error : "+e.getMessage());
		}
		

	}

}
