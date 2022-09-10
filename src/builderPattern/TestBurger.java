package builderPattern;

public class TestBurger {

	public static void main(String[] args) {
	 Burger obj=new Burger();
	 obj.addBread()
	    .addPatty()
	    .addSauces();

	}

}
