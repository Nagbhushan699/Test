package PractisceExamples;

public class TestBrowser {

	public static void main(String[] args) {
	Browser obj=new Browser("Opera",20.366,new String[] {"Timeout","Cable","Usb"});
	obj.setName("Chrome");
	obj.setPlugin(new String[] {"Charger","Usb","Connector"});
	obj.setVersion(20.366);
	obj.printBroswerInfo(obj.getName(),obj.getVersion(),obj.getPlugin());
	}

}
