package Practise12;

public class AccHolder extends SBI {
	String name;
	char Gender;
	public void getAccHolderInfo(String name,char gender) {
		this.name=name;
		this.Gender=gender;
		System.out.println("your name is : "+name);
		System.out.println("your gender is : "+gender);
	}
	@Override
	public  void withdrawMoney() {
		System.out.println("Withdarw Money 500");
	}
	public void sendMoney(String upi) {
		System.out.println("send Money 500 by UPI : "+upi);
	}
	@Override
	public void createAccount() {
		System.out.println("you can create account ");
	}
	@Override
	public void sendMoney() {
		System.out.println("Send money 5000 by UPI");
	}
	
}
