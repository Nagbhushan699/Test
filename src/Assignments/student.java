package Assignments;

public class student {
String name;
int rollno;
int age;
void info(String name,int rollno,int age)
{
	this.name=name;
	this.rollno=rollno;
	this.age=age;
	System.out.println("Student Data : "+name+" "+rollno+" "+age);
}
	public static void main(String[] args) {
		student obj1=new student();
		obj1.info("Aniket", 1, 20);
		student obj2=new student();
		obj2.info("Abhi", 12, 25);
		student obj3=new student();
		obj3.info("Karan", 15, 24);
		student obj4=new student();
		obj4.info("Vaibhav", 1, 28);
		student obj5=new student();
		obj5``.info("Prashant", 12, 26);
	}

}
