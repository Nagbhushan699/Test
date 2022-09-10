package ExceptionHandling;

public class ErrorHandling {
	

		public void t1() {
			System.out.println("t1");
			t2();
		}
		public void t2() {
			System.out.println("t2");
			t3();
		}
		public void t3() {
			System.out.println("t3");
			t1();
		}
		
		public static void main(String[] args) {
			ErrorHandling obj = new ErrorHandling();
			try {
			obj.t1();
			}
			catch(Error e) {
				
				e.printStackTrace();
			}
			System.out.println("Bye...");
		}
		
	}


	


