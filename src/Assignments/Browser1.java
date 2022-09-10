package Assignments;

import java.util.Arrays;

public class Browser1 {
    String browsername;
    String vendorname;
    double currentversion;
    String[]listOfPlugins;
    
	public Browser1(String browsername, String vendorname, double currentversion, String[] listOfPlugins) {
		this.browsername = browsername;
		this.vendorname = vendorname;
		this.currentversion = currentversion;
		this.listOfPlugins = listOfPlugins;
	}
	public String getBrowserName() {
		return browsername;
	}
	public String getVendorName() {
		return vendorname;
	}
	public double getCurrentversion() {
		return currentversion;
	}
	public String[] getListOfPlugins() {
		return listOfPlugins;
	}

	public static void main(String[] args) {
	 Browser1 obj=new Browser1("Opera", "wipro",1.89, new String[] {"Java","VRML","QuickTime"});
     String result1=obj.getBrowserName();
     String result2=obj.getVendorName();
     double result3=obj.getCurrentversion();
     System.out.println("Browser name : "+result1);
     System.out.println("Vendor Name : "+result2);
     System.out.println("current version : "+result3);
     System.out.println("List Of browser plugins : "+Arrays.toString(obj.getListOfPlugins()));
	}

}
