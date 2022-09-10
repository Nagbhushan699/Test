package PractisceExamples;

import java.util.ArrayList;

public class TestBrowser1 {

	public static void main(String[] args) {
		ArrayList<String>plugins=new ArrayList<String>();
		plugins.add("USB");
		plugins.add("charger");
		plugins.add("coonctor");
		Browser1 obj=new Browser1 ("Opera","Wipro",20.366,plugins);
        obj.browserInfo(obj.getbrowserName(),obj.getvendorName(),obj.getCurrentVersion(),obj.getPlugins());
	}

}
