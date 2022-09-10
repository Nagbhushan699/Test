package encapsulation;

public class User1 {
	public String Name;
	private String UN;
	private int pass;
	public void customerAccess() {
		System.out.println("User Access");
		adminAccess("SumitPendkar",123);
	}
	private void adminAccess(String UN,int pass) {
		this.UN=UN;
		this.pass=pass;
	  System.out.println("Admin Access : "+UN+" "+pass);
	}
	public void setUserName(String UN) {
		this.UN=UN;
	}
    public String getUserName() {
    	return UN;
    }
    public void setPassWord(int pass) {
    	this.pass=pass;
    }
    public int getPassWord() {
    	return pass;
    }
    public void print(String UN,int pass) {
    	System.out.println("My Username is : "+UN);
        System.out.println("My Password is : "+pass);
    }
}
