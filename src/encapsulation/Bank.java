package encapsulation;

public class Bank {
public String name;
private int balance;
private int accno;
public void setBalance(int balance) {
	this.balance=balance;
}
public int getBalance() {
	return balance;
}
public void setAccno(int accno) {
	this.accno=accno;
}
public int getAccno(){
	return accno;
}
public void print(int accno,int balance,String name) {
	System.out.println("I am login with "+ name +"Account no :"+accno+" "+"Balance :"+balance);

}
}

