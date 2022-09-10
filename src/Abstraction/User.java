package Abstraction;

public class User extends ATM {
	public User(){
		System.out.println("user");
	}
	public User(int a){
		System.out.println("user hello");
	}
	@Override
	public void withdraw() {
		System.out.println("Withdrwal money");
	}
	@Override
	public void checkBalance() {
	System.out.println("Check Balance");	
	}
	@Override
	public void getMiniStatement() {
		System.out.println("get miniStatement");
	}
	public void changePwd(){
		System.out.println("Change password");
	}
	
}
