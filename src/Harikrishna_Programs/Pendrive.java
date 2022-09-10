package Harikrishna_Programs;

public class Pendrive extends ElectronicDevices {
private double price;
private String type;
private String colour;
private int memoryCapacity;
public Pendrive() {
	super();
}
public void setPrice(double price) {
	this.price=price;
}
public double getPrice() {
return price;
}
public void setType(String type) {
	this.type=type;
}
public String getType() {
	return type;
}
public void setColour(String colour) {
	this.colour=colour;
}
public String getColour() {
	return colour;
}
public void setMemoryCapacity(int memoryCapacity) {
	this.memoryCapacity=memoryCapacity;
}
public int getMemoryCapacity() {
	return memoryCapacity;
}
public void DataStorage() {
	System.out.println(getproductName()+"is a data storage device");
}
public void portabel() {
	System.out.println("is "+getproductName()+" portabel device");
}
@Override
public String toString() {
	return super.toString()+"\n"+
           "price\t\t:"+price+"\n"+
			"type\t\t:"+type+"\n"+
           "colour\t\t:"+colour+"\n"+
			"memoryCapacity\t\t:"+memoryCapacity+" GB";
}

}
