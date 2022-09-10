package PractisceExamples;

public class Bank {
	int bal;
	public void showBalance(String name,long accNo) {
		if(name.equals("bhushan") || (accNo==3589)) {
			bal=322366;
			System.out.println("Your account balance is : "+bal);
		}else {
			throw new IllegalArgumentException("please pass valid details");
		}
	}

}
