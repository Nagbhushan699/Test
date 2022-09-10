package BankProject;

public class BankAccount {
	static String bankName;
	static String branchName;
	static String ifsc;
	String accHName;
	long accNO;
	double balance;
	Address address;
	BankAccount destAcc;
	public void deposit(double amount)throws IllegalArgumentException {
		if(amount<0) {
			throw new IllegalArgumentException("please pass postive value ");
		}
		this.balance=balance+amount;
		alert(amount,"credited from");
	}
	public double withdraw(double amount) {
		if(amount<=0) {
			throw new IllegalArgumentException("please pass postive value ");
		}
		if(amount>balance) {
			throw new IllegalStateException("Insufficient Funds");
		}
		 this.balance=balance-amount;
		 alert(amount,"debited from");
		return amount;
	}
	private void alert(double amount,String action) {
		System.out.println("cash "+amount+" is "+action+" your account "+accNO+"\n");
		System.out.println("current Balance in your account is  "+balance+" \n");
	}
	void transferMoney(BankAccount destAcc,double amount)throws IllegalArgumentException,IllegalStateException {
		this.withdraw(amount);
		 destAcc.deposit(amount);
		System.out.println("cash "+amount+"is transfered to "+destAcc);
	}
	public static void setBankName(String bankName) {
		BankAccount.bankName=bankName;
	}
    public static void setBranchName(String branchName) {
    	BankAccount.branchName=branchName;
	}
    public static void setIfsc(String ifsc) {
    	BankAccount.ifsc=ifsc;
    }
    public void display() {
    	System.out.println("Bank name\t:"     +bankName);
    	System.out.println("Branch name\t:"   +bankName);
    	System.out.println("ifsc Code:\t\s"   +ifsc);
    	System.out.println("AccounHName\t:"   +accHName);
    	System.out.println("AccounNum\t:"     +accNO);
    	System.out.println("AccounBal\t:"     +balance);
    	System.out.println("Dname\t\t\s:"     +address.dnum);
    	System.out.println("Strname\t\t:"     +address.strnum); 
    	System.out.println("City\t\t\s:"      +address.city);
    }


}
