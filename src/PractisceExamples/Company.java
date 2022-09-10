package PractisceExamples;

import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		Employee obj=new Employee();
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter emp name : "); 
        obj.setName(sc.next());
        System.out.println("Enter emp age : "); 
        obj.setAge(sc.nextInt());
        System.out.println("Enter emp salary : "); 
        obj.setSalary(sc.nextDouble());
        System.out.println("Enter emp isActive : "); 
        obj.setIsActive(sc.nextBoolean());
        System.out.println("Enter emp gender : "); 
        obj.setGender(sc.next().charAt(0));
        obj.getEmployeeInfo(obj.getName(), obj.getAge(), obj.getSalary(),obj.getIsActive(), obj.getGender());
        Employee obj1=new Employee();
		Scanner sc1=new Scanner(System.in);
        System.out.println("Enter emp name : "); 
        obj1.setName(sc1.next());
        System.out.println("Enter emp age : "); 
        obj1.setAge(sc1.nextInt());
        System.out.println("Enter emp salary : "); 
        obj1.setSalary(sc1.nextDouble());
        System.out.println("Enter emp isActive : "); 
        obj1.setIsActive(sc1.nextBoolean());
        System.out.println("Enter emp gender : "); 
        obj1.setGender(sc1.next().charAt(0));
        obj.getEmployeeInfo(obj1.getName(), obj1.getAge(), obj1.getSalary(),obj1.getIsActive(), obj1.getGender());

	}

}
