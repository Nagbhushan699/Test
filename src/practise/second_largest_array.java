package practise;

public class second_largest_array {

	public static void main(String[] args) {
	       int a[]= {1,3,4,5,6,7,8};
	       int check=0;
	       for(int i=0;i<a.length;i++)
	       {
	    	   for(int j=i+1;j<a.length;j++)  //a[i]=a[0]=1;a[j]=a[1]=3;check=1;a[i]=3;a[j]=1
	    	   {
	    		   if(a[i]<a[j])              //a[1]=3;a[2]=4;check=3;a[i]=4;a[j]=3;
	    		   {
	    			  check=a[i] ;    
	    			  a[i]=a[j];   
	    			  a[j]=check;  			    
	    		   }
	    	   }
	       }
	       System.out.println("second largest number : "+a[1]);
	}

}
