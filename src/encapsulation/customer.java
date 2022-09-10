package encapsulation;

public class customer {

	public static void main(String[] args) {
      Bank obj=new Bank();
      obj.setBalance(5000);
      obj.setAccno(622510574);
      obj.print(obj.getAccno(), obj.getBalance(),"Bhushan");
      System.out.println(obj.name="Bhalerao ");	
	}

}
