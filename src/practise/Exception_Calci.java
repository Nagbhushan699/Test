package practise;

public class Exception_Calci {

	public static void main(String[] args) {
//		Exception_Addition obj=new Exception_Addition();
		try {
			int result=Exception_Addition.add(-5, 6);
			System.out.println("Result : "+result);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Error : "+e.getMessage());
		}

	}

}
