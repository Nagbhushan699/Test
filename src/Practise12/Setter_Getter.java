package Practise12;

public class Setter_Getter {
private String name;
String getName() {
	return name;
}
void setName(String n) {
	name=n;
}
void display() {
	System.out.println(name);
}
	public static void main(String[] args) {
		Setter_Getter obj=new Setter_Getter();
		obj.setName("bhushan");
		

	}

}
