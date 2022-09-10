package Harikrishna_Programs;

public class ExceptionMain {

	public static void main(String[] args) {
     try {
    	 int result=Exception.validateNum(30);
    	 System.out.println("positive num : "+result);
     }
     catch(IllegalArgumentException e) {
    	 System.out.println("Error : "+e.getMessage());
     }
     catch(IllegalStateException r) {
    	 System.out.println("error :" + r.getMessage());
     }
      
	}

}
