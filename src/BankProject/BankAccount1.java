package BankProject;

public class BankAccount1 {
	static String bankName;
	static String branchName;
	static String ifsc;
	long accNo;
	String accHName;
	double balance;
	Address address;
	public void deposit(double amt)throws IllegalArgumentException {
		if(amt<0)
			throw new IllegalArgumentException("please pass positive amt");
		alert( amt,"Credited to");
		this.balance=balance+amt;
	}
	public double withdraw(double amt)throws IllegalArgumentException,IllegalStateException {
		if(amt<0)
			throw new IllegalArgumentException("please pass positive amt");
		if(amt>balance)
			throw new IllegalStateException("Insufficient funds");
		balance=balance-amt;
		alert(amt,"withdrawn");
		return amt;
	}
	public void alert(double amt,String action) {
		System.out.println("cash "+amt+" is "+action+"from your account "+accNo);
		System.out.println("cash "+amt+" is "+action+"from your account "+accNo);
		System.out.println("your current balance is "+balance);
	}
	public void display() {
		System.out.println("All account details \n");
		System.out.println("BankName\t: "   +bankName);
		System.out.println("BranchName\t : "+branchName);
		System.out.println("IFSC\t\t : "    +bankName);
		System.out.println("AcccHName\t : " +accHName);
		System.out.println("AcccNum\t\s : " +accNo);
		System.out.println("Balance\t : "   +balance);
		System.out.println("DNo\t\t\s: "    +address.dnum);
		System.out.println("strNo\t\s : "   +address.strnum);
		System.out.println("city\t\t: "     +address.city);
	}

}
