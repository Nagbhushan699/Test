package Practise12;

public class User extends Ecommerce{
	public int payment(String netBanking,int accNo,String Upi,String Gpay) {
		System.out.println("Payment ----credit Card");
		return 100;
	}

	public static void payment(String creditCard) {
		System.out.println("Payment ----credit Card  User: "+creditCard);
	}
	public static void main(String[] args) {
	User obj=new User();
	User.payment("SBI");
	obj.payment("SBI", 358);
	obj.payment("HDFC", 10, "PhonePay");

	}

}
