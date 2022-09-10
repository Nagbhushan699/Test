package PractisceExamples;

public class Employee {
   private String name;
   private int age;
   private double salary;
   private  boolean isActive;
   private char gender;
   public void setName(String name) {
	   this.name =name;
   }
   public String getName() {
	   return name;
   }
   public void setAge(int age) {
	   this.age=age;
   }
   public int getAge() {
	   return age;
   }
   public void setSalary(double salary) {
	   this.salary=salary;
   }
   public double getSalary() {
	   return salary;
   }
   public void setIsActive(boolean isActive) {
	   this.isActive=isActive;
   }
   public boolean getIsActive() {
	   return isActive;
   }
   public void setGender(char gender) {
	   this.gender=gender;
   }
   public char getGender() {
	   return gender;
   }
   public void getEmployeeInfo(String name,int age,double salary,boolean isActive,char gender) {
	   System.out.println("Employee Info\t : ");
	   System.out.println("Employee Name\t : "+name);
	   System.out.println("Employee age\t : "+age);
	   System.out.println("Employee salary\t: "+salary);
	   System.out.println("Employee isActive\t: "+isActive);
   }
	
}
