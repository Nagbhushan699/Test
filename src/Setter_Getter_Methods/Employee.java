package Setter_Getter_Methods;

public class Employee {
private int eno;
private String ename;
private double sal;
private String dept;
public void setEno(int eno) {
	this.eno=eno;
}
public int getEno() {
	return eno;
}
public void setEname(String ename) {
	this.ename=ename;
}
public String getEname() {
	return ename;
}
public void setSal(double sal) {
	this.sal=sal;
}
public double getSal() {
	return sal+(0.2*sal);
}
public void setDept(String dept) {
	this.dept=dept;
}
public String getDept() {
	return dept;
}

public void display(int eno,String ename,double sal,String dept) {
	System.out.println("Employee Details : \n");
	System.out.println("Employee eno\t:"    +eno);
	System.out.println("Employee ename\t:"  +ename);
	System.out.println("Employee salary\t:" +sal);
	System.out.println("Employee dept\t:"   +dept);
	
}
//public String toString() {
//	return display(eno,ename,sal,dept);
//}
//public void display() {
//	System.out.println("Employee Details : \n");
//	System.out.println("Employee eno\t:"    +eno);
//	System.out.println("Employee ename\t:"  +ename);
//	System.out.println("Employee salary\t:" +sal);
//	System.out.println("Employee dept\t:"   +dept);
//}
}
