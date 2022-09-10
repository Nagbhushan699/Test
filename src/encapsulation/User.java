package encapsulation;
public class User {
private String firstName;
private String lastName;
private long  phone;
private boolean isPrime;
//public User(String firstName,String lastName,long phone,boolean isPrime) {
//	this.firstName=firstName;
//	this.lastName=lastName;
//	this.phone=phone;
//	this.isPrime=isPrime;
//}
public void setFirstName(String firstName) {
	this.firstName=firstName;
}
public String getFirstName() {
      return firstName;
}
public void setLastName(String lastName) {
	this.lastName=lastName;
}
public String getLastName() {
	return lastName;
}
public void setPhone(long phone) {
	this.phone=phone;
}
public long getPhone() {
	return phone;
}
public void setIsPrime(boolean isPrime) {
	this.isPrime=isPrime;
}
public boolean getIsPrime() {
	return isPrime;
}
public void show() {
	System.out.println("MY INFO "+firstName+" "+lastName+" "+phone+" "+isPrime+" ");
}
}
