package bhalerao;
class bhale
{
	String s="bhushan";
	String t="bhale";
	public String tostring()
	{
		return s;
		
	}
}
class bhalerao
{
	String s="ram";
	String t="bhale";
	public String tostring()
	{
		return s;
		
	}
}

public class desending_order_array {

	public static void main(String[] args) {
//	   int a[]= {10,9,8,7,6,5,4,3,2,1};
//	   for(int e:a)
//	   {
//		   System.out.println(e);
//	   }
	   bhale obj1=new bhale();
	   bhalerao obj2=new bhalerao();
	   Object a []= {obj1,obj2};
	   for(Object e:a)
		   {
			   System.out.println(e);
	   }

	}

}
