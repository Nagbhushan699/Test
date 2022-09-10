package practise;

import java.util.Scanner;

public class College {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many students Info do you want");
		int noOfStudents=sc.nextInt();
	  Student stu[]=new Student[noOfStudents];
	  for(int i=0;i<stu.length-1;i++) {
		  stu[i]=new Student();
		  System.out.println("Enter students dept\t : ");
		  stu[i].setDept(sc.nextLine()); sc.nextLine();
		  System.out.println("Enter students age\t   : ");
		  stu[i].setAge(sc.nextInt());
		  System.out.println("Enter students name\t   : "); sc.nextLine();
		  stu[i].setSname(sc.nextLine());
		  System.out.println("Enter students number\t : ");
		  stu[i].setNum(sc.nextInt());
		  System.out.println("Enter students gender\t : ");
		  stu[i].setGender(sc.next().charAt(0));
	  }
	  for(int i=0;i<stu.length-1;i++) {
		  stu[i].display();
		  stu[i].reading();
		  stu[i].learning();
	  }
	

	}

}
