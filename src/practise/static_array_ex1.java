package practise;

import java.util.ArrayList;

public class static_array_ex1 {

	public static void main(String[] args) {
//	   int a[]= {10,20,30,40};
//	   int sum=0;
//	   for(int i=0;i<a.length;i++)
//	   {
//		   sum=sum+a[i];            //0=0+10;sum=10;
//	   }                            //10=10+20;sum=30;
//	   System.out.println(sum);     //30=30+30;sum=60
//	                                   //60=60+40;sum=100
//	}
/*         int a[] = {10,20,30,40};    
         int b[]= {50,60,70,80};
         int c[]=new int[a.length+b.length];
         for(int i=0;i<a.length;i++)
         {
        	 c[i]=a[i];
         }
         for(int i=0;i<b.length;i++)
         {
        	 c[a.length+i]=b[i];
         }
         for(int i=0;i<a.length+b.length;i++)
         {
        	 System.out.println(c[i]);
         }*/
		/*ArrayList<String>colors=new ArrayList<String>();
		colors.add("White");
		colors.add("Blue");
		colors.add("Red");
		colors.add("Brown");
		colors.remove(1);
		colors.add(1,"Black");
		colors.remove(2);
		for(String e : colors)
		{
			System.out.println("All  colors are : "+e);
		}*/
		/*ArrayList<Object> obj=new ArrayList<Object>();
          obj.add("Bhushan");
          obj.add(23);
          obj.add(50.00);
          for(Object ee : obj)
          {
        	  System.out.println("My data is : "+ee);
          }*/
		/*Object a[]=new Object[5];
		a[0]="Bhushan";
		a[1]=12.44;
		a[2]=10;
		for(Object e : a)
		{
			System.out.println(e);
		}*/
		/*int e[]= {12,34,2,3,4};
		System.out.println(e[1]);
		System.out.println(e[4]);*/
//  ArrayList<Object>emp_data=new ArrayList<Object>();
//  emp_data.add("Bhushan");
//  emp_data.add(20.33);
//  emp_data.add(20);
// for(int i=emp_data.size()-1;i>=0;i--)
// {
//	 System.out.println(emp_data.get(i));
// }
		int a[]=new int[3];
		a[0]=1;
	
		a[2]=4;
		for(int r : a)
		{
			System.out.println(r);
		}
		
}
}