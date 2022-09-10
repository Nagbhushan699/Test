package Practise12;

public abstract class SBI implements RBI {
	private static String bankName;
	private long accNo;
	private String IFSC;
	public static void setBankName(String bankName) {
		SBI.bankName=bankName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setAccNo(long accNo) {
	  this.accNo=accNo;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setIFSC(String IFSC) {
		this.IFSC=IFSC;
	}
	public String getIFSC() {
		return IFSC;
	}
	public void checkBalance() {
		System.out.println("Insert your card ");
		System.out.println("Click on check Balance");
	}
	public abstract void sendMoney();
}
