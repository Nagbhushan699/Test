package Assignments;

import java.util.Arrays;

public class Browser {
	String name;
	double version;
	String []plugin;
	public Browser(String name,double version,String[]plugin) {
		this.name=name;
		this.version=version;
	    this.plugin=plugin;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setVersion(double version) {
		this.version=version;
	}
	public double getVersion() {
		return version;
	}
	public void setPlugin(String[]plugin){
		this.plugin=plugin;
	}
	public String[] getPlugin() {
		return plugin;
	}

	public static void main(String[] args) {
	Browser obj=new Browser("opera",12.33,new String[] {"Java","QuickTime","RealPlayer"});
     String res=obj.getName();
     double ver=obj.getVersion();
     System.out.println("Browser Name : "+res);
     System.out.println("Browser Version : "+ver);
     System.out.println("Browser plugin : "+Arrays.toString(obj.getPlugin()));
	}

}
