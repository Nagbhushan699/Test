package practise;

public class Student {
	static String dept;
	static int age;
	String sname;
	int num;
	char gender;
	public void reading() {
		System.out.println("students reading ");
	}
	public void learning() {
		System.out.println("students learning ");
	}
	public void setDept(String dept) {
		Student.dept=dept;
	}
	public String getDept() {
		return dept;
	}
	public void setAge(int age) {
		Student.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setSname(String sname) {
		this.sname=sname;
	}
	public String getSname() {
		return  sname;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public int getNum() {
		return num;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public char getGender() {
		return gender;
	}
	public void display() {
		System.out.println("All students info : \n");
		System.out.println("Students dept\t: "  +dept);
		System.out.println("Students age\t\s: " +age);
		System.out.println("Students sname\t: " +sname);
		System.out.println("Students num\t\s: " +num);
		System.out.println("Students gender\t: "+gender);
	}
	

}
