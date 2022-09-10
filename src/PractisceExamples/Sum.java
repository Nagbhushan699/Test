package PractisceExamples;

public class Sum {
   public static int add(int a) throws IllegalArgumentException,IllegalStateException {
	   if(a<0) {
		   throw new IllegalArgumentException("please pass positive value");
	   }
	   if(a<10 || a>20) {
		   throw new IllegalStateException("please pass value betn 10-20 ");
	   }
	   else {
		   return a+30;
	   }
   }
	
	
	public static void main(String[] args) {
		try {
			int res=Sum.add(9);
			System.out.println("result is : "+res);
		}
		catch(IllegalStateException | IllegalArgumentException e) {
			System.out.println("Error : "+e.getMessage());
		}
//		catch(IllegalArgumentException e) {
//			System.out.println("Error : "+e.getMessage());
//		}

	}

}
