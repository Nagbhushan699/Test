package Assignments;

import java.util.Arrays;

public class University {
  String name;
  String country;
  int establishedDate;
  String listOfCourse[];
 public  University(String name,String country,int establishedDate,String[] listOfCourse) {
	 this.name=name;
	 this.country=country;
	 this.establishedDate=establishedDate;
	 this.listOfCourse=listOfCourse;
 }
 public String getName() {
	 return name;
 }
 public String getCountry() {
	 return country;
 }
 public int getestablishedDate() {
	 return establishedDate;
 }
 public String[] getListOfCourse() {
	 return listOfCourse;
 }
	public static void main(String[] args) {
		University obj=new University("SRTMUN","India",1/6/2022,new String[] {"Btech,Bcom","B.Farm"});
       String res1=obj.getName();
       String res2=obj.getCountry();
       int res3=obj.getestablishedDate();
      System.out.println("University name : "+res1);
      System.out.println("Country name : "+res2);
      System.out.println("Established date : "+res3);
      System.out.println("Courses list : "+Arrays.toString(obj.getListOfCourse()));
	}

}
