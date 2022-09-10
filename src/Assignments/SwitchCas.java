package Assignments;
public class SwitchCas {
		public void show(String browser) {
			switch(browser)
			{
			case "IE" : System.out.println("IE is launched");
			break;
			case "CHROME" : System.out.println("IE is launched");
			break;
			case "OPERA" : System.out.println("IE is launched");
			break;
			default : System.out.println("INVALID");
			break;
			}
			}	
		public static void main(String[] args) {
			SwitchCas obj=new SwitchCas();
			obj.show("IE1");
}
		}
	
