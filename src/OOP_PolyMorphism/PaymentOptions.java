package OOP_PolyMorphism;

public class PaymentOptions {
	void payment(String creditCard) {
		System.out.println("payment has done by credit card : "+creditCard);
	}
	void payment(String debitCard,String creditCard) {
		System.out.println("payment has done by credit card : "+creditCard+ " "+debitCard);
	}

	public static void main(String[] args) {
		PaymentOptions obj=new PaymentOptions();
		obj.payment("mastercard");
		obj.payment("rupay", "sbi");

	}

}
