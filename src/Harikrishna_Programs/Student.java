package Harikrishna_Programs;

public class Student {
	String name;
	int rollno;
	static String dept;
	static String Studyingyear;
	public static  void getDeptStudyingyr() {
		dept="Civil";
		Studyingyear="First year";
		System.out.println(dept);
		System.out.println(Studyingyear);
	}
	public void getNameRollNo(String name,int rollno) {
		this.name=name;
		this.rollno=rollno;
		System.out.println("My name is :  "+name);
		System.out.println("My rollno is :  "+rollno);
	}

}
