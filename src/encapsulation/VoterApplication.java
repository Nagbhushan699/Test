package encapsulation;
public class VoterApplication {
	private int appId;
	private String applicantName;
	private int age;
	private String consultancy;
	public void setAppId(int appId) {
		this.appId=appId;
	}
	public int getAppId() {
		return appId;
	}
	public void setapplicantName(String applicantName) {
		this.applicantName=applicantName;
	}
	public String applicantName() {
		return applicantName;
	}
	public int getAge() {
		return age;
	}
	public void setConsultancy(String consultancy) {
		this.consultancy=consultancy;
	}
	public String getConsultancy() {
		return consultancy;
	}
	public void setAge(int age)throws IllegalArgumentException {
		if(age<=18 || age>=100)
			throw new IllegalArgumentException("Application rejected due to age is : "+age+" age must be between 18-100");
			System.out.println("Congratulations , please collect collect your voterCard");
		 this.age=age;
	}
  
}
