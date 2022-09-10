package practise;

public class ATM_Encapsulation {
	public  String  username;
	private  int pass ;
	private int OTP;
	public void setUsername(String username) {
		this.username=username;
	}
	public String getUsername() {
		return username;
	}
	public void setpass(int pass) {
		this.pass=pass;
	}
	public int  getpass() {
		return pass;
	}
	public void setOTP(int OTP) {
		this.OTP=OTP;
	}
	public int  getOTP() {
		return OTP;
	}	
	 public void print(String UN,int pass,int OTP) {
		 System.out.println("I am Login with : "+UN+" "+pass+" "+OTP);
	 }
	}
	


	
