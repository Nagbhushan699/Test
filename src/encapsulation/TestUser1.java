package encapsulation;

public class TestUser1 {

	public static void main(String[] args) {
		 User1 obj=new User1();
		 obj.customerAccess();
         obj.setPassWord(358);
         obj.setUserName("Amol699366");
         obj.print(obj.getUserName(),obj.getPassWord());
//         String UName=obj.getUserName();
//         int pwd=obj.getPassWord();
//         System.out.println("My Username is : "+UName);
//         System.out.println("My Password is : "+pwd);
	}

}
