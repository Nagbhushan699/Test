package encapsulation;

public class TestUser {

	public static void main(String[] args) {
		User obj=new User();
        obj.setFirstName("Amol");
        obj.setLastName("Kamble");
        obj.setPhone(706636645);
        obj.setIsPrime(false);
        obj.getFirstName();
        obj.getLastName();
        obj.getPhone();
        obj.getIsPrime();
        obj.show();
	}

}
