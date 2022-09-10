package Collection_Frameworks;

public class Bike1 {
private String name;
private int chassisNo;
public void start() {
	System.out.println("Bike Start");
}
public void stop() {
	System.out.println("Bike Stop");
}
public void setName(String name) {
	this.name=name;
}
public void setChassisNo(int chassisNo) {
this.chassisNo=chassisNo;
}
public String getName() {
	return name;
}
public int getChassisNo() {
	return chassisNo;
}
public void display() {
	System.out.println("Bike Info");
	System.out.println("Bike Name : "+name);

	System.out.println("Bike chassisNo : "+chassisNo);
}
}
