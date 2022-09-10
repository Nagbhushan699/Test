package practise;

public class CalciSub {

	public static void main(String[] args) {
	  try {
		  int res=Substartcion_EX1.sub(10,-115);
		  System.out.println("Result : "+res);
		  
	  }
	  catch(IllegalArgumentException e) {
		  System.out.println("Error : "+e.getMessage());
	  }

	}

}
