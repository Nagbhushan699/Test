package Setter_Getter_Methods;

public class Person {
	private static int eyes;
	private static int ears;
	private static int legs;
	private String name;
	private int age;
	private double height;
	static {
		eyes=2;
		ears=2;
		legs=2;
	};
//	public Person(String name,int age,double height){
//		this.name=name;
//		this.age=age;
//		this.height=height;
//	}
	public static int getEyes() {
		return eyes;
	}
	public static void setEyes(int eyes) {
		Person.eyes = eyes;
	}
	public static int getEars() {
		return ears;
	}
	public static void setEars(int ears) {
		Person.ears = ears;
	}
	public static int getLegs() {
		return legs;
	}
	public static void setLegs(int legs) {
		Person.legs = legs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void sleeping() {
		System.out.println(name+"is sleeping as a "+this.getClass().getName());
	}
	public void eating() {
		System.out.println(name+" is eating as a "+this.getClass().getName());
	}
	public String displayStaticProperties() {
		return "\neyes\t:"+eyes+"\nears\t:"+ears+"\nlegs\t:"+legs;
	}
	@Override
	public String toString() {
		return displayStaticProperties()+"\nname\t:"+name+"\nage\t:"+age+"\nheight\t:"+height;
	}

}
