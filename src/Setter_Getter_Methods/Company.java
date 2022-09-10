package Setter_Getter_Methods;

import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.setEno(10);
		obj.setEname("Bhushan");
		obj.setDept("Civil");
		obj.setSal(500);
//		System.out.println(obj);
		System.out.println(obj.getEno()+" "+obj.getEname()+" "+obj.getSal()+" "+obj.getDept());
	    obj.display(obj.getEno(), obj.getEname(), obj.getSal(),obj.getDept());
	}
    
//     Scanner scn=new Scanner(System.in);
//     System.out.println("How many employees details you want : ");
//     int noOfEmp=scn.nextInt();
//     Employee []emp=new Employee[noOfEmp];
//     System.out.println("Employee  details ");
//     for(int i=0;i<=emp.length-1;i++){
//     emp[i]=new Employee();
//     System.out.println("enter emp no : ");
//     emp[i].setEno(scn.nextInt());
//     System.out.println("enter emp name : "); scn.nextLine();
//     emp[i].setEname(scn.nextLine());
//     System.out.println("enter emp salary : ");
// 	 emp[i].setSal(scn.nextDouble());scn.nextLine();
// 	 System.out.println("enter emp dept : ");
// 	 emp[i].setDept(scn.nextLine());
//     }
//     for(int i=0;i<=emp.length-1;i++)
//          emp[i].display();
//	}

}
