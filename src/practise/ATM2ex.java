package practise;

public class ATM2ex {

	public static void main(String[] args) {
		ATM_Encapsulation obj=new ATM_Encapsulation();
         obj.setUsername("nagbhushan699");
         String UN=obj.getUsername();
         obj.setpass(358);
         int pwd=obj.getpass();
         obj.setOTP(3689);
         int otp=obj.getOTP();
         obj.print(UN, pwd, otp);
	
     	
	}

}
