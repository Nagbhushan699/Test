package PractisceExamples;

import java.util.ArrayList;

public class Browser1 {
	private String browserName;
	private String vendorName;
	private double currentVersion;
	private ArrayList<String>plugins;
  public Browser1(String browserName,String vendorName,double currentVersion,ArrayList<String>plugins){
	   this.browserName=browserName;
	   this.vendorName=vendorName;
	   this.currentVersion=currentVersion;
	   this.plugins=plugins;
   }
  public String getbrowserName() {
	  return browserName;
  }
  public String getvendorName() {
	  return vendorName;
  }
  public double getCurrentVersion() {
	  return currentVersion;
  }
  public ArrayList<String> getPlugins() {
	  return plugins;
  }
  public void browserInfo(String browserName,String vendorName,double currentVersion,ArrayList<String>plugins) {
	  System.out.println("Browser Info : ");
	  System.out.println("Browser name : "+browserName);
	  System.out.println("Browser vendorName : "+vendorName);
	  System.out.println("Browser currentVersion : "+currentVersion);
	  for(int i=0;i<=plugins.size()-1;i++) {
		  System.out.println("plugins["+i+"] : "+plugins.get(i));
	  }
  }
}
