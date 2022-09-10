package Assignments;

import java.util.Arrays;

public class TestBrowser {

	public static void main(String[] args) {
		Browser obj=new Browser("opera",12.33,new String[] {"Java","VRML","QuickTime"});
	     String res=obj.getName();
	     double ver=obj.getVersion();
	     System.out.println("Browser Name : "+res);
	     System.out.println("Browser Version : "+ver);
	     System.out.println("Browser plugin : "+Arrays.toString(obj.getPlugin()));
	     obj.setName("Chrome");
	     obj.setVersion(1.8);
	     obj.setPlugin(new String[] {"Adobe Acrobat","Adobe Flash","SilverLight"});
	     String res1=obj.getName();
	     double ver1=obj.getVersion();
	     System.out.println("Browser Name : "+res1);
	     System.out.println("Browser Version : "+ver1);
	     System.out.println("Browser plugin : "+Arrays.toString(obj.getPlugin()));
	}

}
