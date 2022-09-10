package PersonProject;

public class Person1 {
 private static int eyes;
 private static int ears;
 private static int legs;
 private String name;
 private double height;
 private int age;
 static {
	 eyes=2;
	 ears=2;
	 legs=2;
 }
 public Person1(String name,double height,int age) {
	 this.name=name;
	 this.height=height;
	 this.age=age;
 }
public static int getEyes() {
	return eyes;
}
public static void setEyes(int eyes) {
	Person1.eyes = eyes;
}
public static int getEars() {
	return ears;
}
public static void setEars(int ears) {
	Person1.ears = ears;
}
public static int getLegs() {
	return legs;
}
public static void setLegs(int legs) {
	Person1.legs = legs;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
 public String displayStaticProperties() {
	 return "\neyes\t:"+eyes+"\nears\t:"+ears+"\nlegs:"+legs;
 }
 public void eating() {
	 System.out.println(name+" is eating as a : "+this.getClass().getName());
 }
 public void sleeping() {
	 System.out.println(name+" is sleeping as : "+this.getClass().getName());
 }
 @Override
  public String toString() {
	  return displayStaticProperties()+"\nname\t:"+name+"\nage\t:"+age+"\nheight\t:"+height;
  }
}
