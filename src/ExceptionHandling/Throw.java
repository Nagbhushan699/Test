package ExceptionHandling;

public class Throw {

	public static void main(String[] args) {
        String data = null;
		try {
		if(data == null) {
			System.out.println("NODATAFOUNDEXCPETION");
			//There is no data available in the file...
			//404 Error not found
			//invalid URL
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			System.out.println("Bye....");
			
			
			try {
				
				int p = 9/0;
			}
			//catch block is not mandatory...finally is...	
			finally {
				
			}

	}
	}



