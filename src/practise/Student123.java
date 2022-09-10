package practise;

public class Student123 extends Object{
  int sno;
  String sname;
  int age;
  static String eyes;
  Student123(int sno,String sname,int age,String eyes){
	  this.sno=sno;
	  this.sname=sname;
	  this.age=age;
	  this.eyes=eyes;
  }
  public int show() {
	 // return "my name is bhusan \n";
	  return 10;
  }
  
  @Override
  public String toString() {
	  return show()+"\nname:"+sname+"\nno:"+sno+"\nsage: "+age+" "+"\neyes"+eyes;
  }
  class college{
	  public static void main(String[]args) {
		  Student123 obj=new Student123(10,"Bhushan",23,"2");
		  System.out.println(obj);
	  }
  }
}
