package PractisceExamples;

public class Univeristy {
 String name;
 String country;
 String establishedDate;
 String []courses;
 public Univeristy(String name,String country,String establishedDate,String[]courses){
	 this.name=name;
	 this.country=country;
	 this.establishedDate=establishedDate;
	 this.courses=courses;
 }
 public String getName() {
	 return name;
 }
 public String getcountry() {
	 return name;
 }
 public String getestablishedDate () {
	 return establishedDate;
 }
 public String[] getCourses() {
	 return courses ;
 }
 public void getUniverSityInfo(String name,String country,String establishedDate,String[]Courses) {
	 System.out.println("University Info");
	 System.out.println("University name : "+name);
	 System.out.println("University country : "+country);
	 System.out.println("University establishedDate : "+establishedDate);
	 for(String e:courses) {
		 System.out.println("University Courses : "+e);
	 }
 }
 }

 

