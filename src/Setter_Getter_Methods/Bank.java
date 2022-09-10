package Setter_Getter_Methods;

public class Bank {

	public static void main(String[] args) {
	BankAccount obj=new BankAccount();
	obj.setBankName("SBI");
	obj.setAccNo(622255);
	obj.setIsActive(true);
	obj.display();
      if(obj.isActive()) {
    	  System.out.println("Acc is Active");
      }
      else {
    	  System.out.println("Account is not active");
      }
	}

}
