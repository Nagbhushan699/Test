package Assignments;

public class Employee {
   private String name;
   private int age;
   private double salary;
   private boolean isActive;
   private char gender;
   public void setName(String name) {
	   this.name=name;
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
   public void setBoolean(boolean isActive) {
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
	   System.out.println("employee Information : "+name+" "+age+" "+salary+" "+isActive+" "+gender);
   }
   
	public static void main(String[] args) {
		Employee  obj=new Employee();
		obj.setName("Karan");
		obj.setAge(20);
		obj.setSalary(20000.35);
		obj.setBoolean(true);
		obj.setGender('M');
		obj.getEmployeeInfo(obj.getName(), obj.getAge(), obj.getSalary(),obj.getIsActive(),
				obj.getGender());

	}

}
