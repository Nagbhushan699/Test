package Setter_Getter_Methods;

public class Student extends Person{
  private int sno;
  private static String course;
  private double fee;
  static {
	  course="TDIT Solutions ";
  }
  public void setSno(int sno) {
	  this.sno=sno;
  }
  public int getSno() {
	  return sno;
  }
  public void setFee(double fee) {
	  this.fee=fee;
  }
  public double getFee() {
	  return fee;
  }
  public void reading() {
	  System.out.println(getName()+" is reading as a "+this.getClass().getName());
  }
  public void Writing() {
	  System.out.println(getName()+" is writing as a "+this.getClass().getName());
  }
  public String displayStaticProperties() {
	  return "\nCourse\t: "+course;
  }
  @Override
  public String toString() {
	  return super.toString()+displayStaticProperties()+"\nsno\t:"+sno+"\nfee\t:"+fee;
  }
}
