package Harikrishna_Programs;

public class UserCalci {

	public static void main(String[] args) {
		try {
			int b=Addition.add(-40);
			System.out.println("Result : "+b);
		}
		catch(IllegalArgumentException |IllegalStateException e) {
			System.out.println("Error Message : "+e.getMessage());
		}
//		catch(IllegalStateException r) {
//			System.out.println("Error Msg : "+r.getMessage());
//		}

	}

}
