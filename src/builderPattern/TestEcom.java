package builderPattern;

public class TestEcom {

	public static void main(String[] args) {
		EcomApp obj=new EcomApp();
		obj.login()
		.login("Bhushan@123", 358)
		.search("Vivo")
		.search("Vivo",123333);
		

	}

}
