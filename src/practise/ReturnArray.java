package practise;

public class ReturnArray {
	int a[]=new int[5];
	public int[] returnArray() {
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+2;
		}
	
		return a;
	}

	public static void main(String[] args) {
		ReturnArray obj=new ReturnArray();
		int e[]=obj.returnArray();
        for(int r:e)
        {
        	System.out.println(r);
        }
	}

}
