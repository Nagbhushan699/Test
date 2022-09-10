package encapsulation;

public class VoterCard {
 private int appID;
 private String applicantName;
 private int age;
 public void setAppId(int appID) {
	 this.appID=appID;
 }
 public int getAppId() {
	 return appID;
 }
 public void setApplicantName(String applicantName) {
	 this.applicantName=applicantName;
 }
 public String getApplicantName() {
	 return applicantName;
 }
 public void setAge(int age)throws IllegalArgumentException {
	 if( age<18 || age>100) 
		 throw new IllegalArgumentException("please pass age in between 18-100");
		 System.out.println(" congratulations ! please collect your voter card");
	 this.age=age;	 
 }
 public int getAge() {
	 return age;
 }
 public void showInfo(int appID,String applicantName,int age) {
	 System.out.println("Aplicant Info : ");
	 System.out.println("Aplicant appId : "+appID);
	 System.out.println("Aplicant Name : "+applicantName);
	 System.out.println("Aplicant age: "+age);
 }
}
