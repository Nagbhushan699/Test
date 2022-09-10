package Abstraction;

abstract public class ATM {
  public  ATM(){
		System.out.println("ATM");
	}
  public  ATM(String atm){
		System.out.println(" this is ATM");
	}
	String nameOfAccHolder;
	private int pwd;
	
 public void sweepCard() {
	 System.out.println("please swipe your card");
 }
 public void showInfo(String nameOfAccHolder,int pwd) {
		this.nameOfAccHolder=nameOfAccHolder;
		this.pwd=pwd;
		System.out.println("Name of account holder : "+nameOfAccHolder);
		System.out.println("my pin is  : "+pwd);
	}
 public abstract  void withdraw();
 public abstract  void checkBalance();
 public abstract  void getMiniStatement();
}
