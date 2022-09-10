package practise;

public class throwException_ extends RuntimeException {
	 throwException_(String msg) {
		super(msg);
	}
}
class thy 
{
	
	public static void main(String[] args) {
		try {
			throw new throwException_("hello");
		}
		catch(throwException_ e) {
			System.out.println(e);
		}
		System.out.println("namste");

	}

}
