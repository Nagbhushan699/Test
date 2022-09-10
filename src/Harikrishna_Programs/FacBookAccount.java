/**
 * 
 */
package Harikrishna_Programs;

/**
 * @author bhalerao
 *
 */
public class FacBookAccount {
private String name;
private String email;
private long mobile;
private char gender;
private String dob;
private String schoolName;
private String CollegeName;
private String workingCompanyName;
public FacBookAccount(String name,String email,long mobile,char gender,String dob) {
	this.name=name;
	this.email=email;
	this.mobile=mobile;
	this.gender=gender;
	this.dob=dob;
}
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public void setEmail(String email) {
	this.email=email;
}
public String getEmail() {
	return email;
}
public void setMobile(long mobile) {
	this.mobile=mobile;
}
public long getMobile() {
	return mobile;
}
public void setGender(char gender) {
	this.gender=gender;
}
public char getGender() {
	return gender;
}
public void setDob(String dob) {
	this.dob=dob;
}
public String getDob() {
	return dob;
}
public void setSchoolName(String schoolName) {
	this.schoolName=schoolName;
}
public String getSchoolName() {
	return schoolName;
}
public void setCollegeName(String collegeName) {
	this.CollegeName=collegeName;
}
public String getCollegeName() {
	return CollegeName;
}
public void setWorkingCompanyName(String WorkingCompanyName) {
	this.workingCompanyName=WorkingCompanyName;
}
public String getWorkingCompanyName() {
	return workingCompanyName;
}
public void display() {
	System.out.println("Facebook Account details**********");
	System.out.println("Name    : "           +name);
	System.out.println("email : "             +email);
	System.out.println("mobile : "            +mobile);
	System.out.println("gender : "            +gender);
	System.out.println("dob : "               +dob);
	System.out.println("SchoolName : "        +schoolName);
	System.out.println("collegeName : "       +CollegeName);
	System.out.println("workingCompanyName : "+workingCompanyName);
	
}
}
