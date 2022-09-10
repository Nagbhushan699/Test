package Setter_Getter_Methods;

public class BankAccount {
   private  String bankName;
   private  long accNo;
   private  boolean isActive;
    public void setBankName(String bankName) {
    	this.bankName=bankName;
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
    public void setIsActive(boolean isActive) {
    	this.isActive=isActive;
    }
    public boolean isActive() {
    	return isActive;
    }
    public void display() {
    	System.out.println(" BankName : "+bankName);
    	System.out.println("Acc Num : "+accNo);
//    	System.out.println(" Acc is Active : "+isActive);
    }
    
}
