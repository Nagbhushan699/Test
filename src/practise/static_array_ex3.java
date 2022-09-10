package practise;

public class static_array_ex3 {

	public static void main(String[] args) {
//		 int a[]= {10,20,30,400,50};
//		 int max=a[0];
//		 for(int i=0;i<a.length;i++)
//		 {
//			 if(a[i]>max)
//			 {
//				 max=a[i];
//			 }
//		 }
//		 System.out.println("maximum number is : "+max);
		 int a[]= {10,20,30,400,50};
		 int min=a[0];
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]<min)
			 {
				 min=a[i];
			 }
		 }
		 System.out.println("minimum number is : "+min);
	}

}
