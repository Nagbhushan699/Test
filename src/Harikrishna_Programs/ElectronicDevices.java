package Harikrishna_Programs;
//Project on Computer-Pendrive objects by using OOP-Principles;
public class ElectronicDevices {
private static String productName;
private String mfg_Company;
private boolean portable;
private int warrenty;
private String serviceCentres;
static{
	System.out.println("**********Electronics Devices");
}
public static void setproductName(String productName) {
  ElectronicDevices.productName=productName;
}
public static String getproductName() {
	return productName;
}
public void setMfg_Company(String mfg_Company) {
	this.mfg_Company=mfg_Company;
}
public String getMfg_Company() {
	return mfg_Company;
}
public void setPortable(boolean portable) {
	this.portable=portable;
}
public boolean isPortable() {
	return portable;
}
public void setWarrenty(int warrenty) {
	this.warrenty=warrenty;
}
public int getWarrenty() {
	return warrenty;
}
public void setServicesCentres(String serviceCentres) {
	this.serviceCentres=serviceCentres;
}
public void communication() {
	System.out.println(productName+" is useful in communication");
}
public void entertainment() {
	System.out.println(productName+" is useful in entertainment");
}
public void education() {
	System.out.println(productName+" is useful in education");
}
@Override
public String toString() {
	return "productName\t:"+productName+"\n"+
			"mfg_Company\t:"+mfg_Company+"\n"+
			"portable\t:"+portable+"\n"+
			"warrenty\t:"+warrenty+" year \n"+
			"serviceCentres\t:"+serviceCentres+"\n";
}
}
