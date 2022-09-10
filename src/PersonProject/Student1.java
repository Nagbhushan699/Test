package PersonProject;

public class Student1 extends Person1{
 private static String instituteName;
 private String course;
 private int fee;
 static {
	 instituteName="TDIT Solutions";
 }
 public Student1(String name,double height,int age,String course,int fee){
	 super(name,height,age);
	 this.course=course;
	 this.fee=fee;
 }
public static String getInstituteName() {
	return instituteName;
}
public static void setInstituteName(String instituteName) {
	Student1.instituteName = instituteName;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getFee() {
	return fee;
}
public void setFee(int fee) {
	this.fee = fee;
}
 public String displayStaticValues() {
	 return "\ninstituteName\t:"+instituteName;
 }
 public void reading() {
	 System.out.println(getName()+" is reading as a "+this.getClass().getName());
 }
 public void writing() {
	 System.out.println(getName()+" is writing as a "+this.getClass().getName());
 }
 @Override
 public String toString() {
	 return displayStaticValues()+"\nCourse\t:"+course+"\nfee\t:"+fee;
 }
}
