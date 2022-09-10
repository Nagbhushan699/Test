package encapsulation;

public class Browser {
public void launchBrowser() {
	System.out.println("Launch Broswer");
	checkBrowserVersion();
	checkBrowserCompatibilty();
	checkBrowserRam();
}
private void checkBrowserVersion() {
	System.out.println("Browser Version 1.2");
}
private void checkBrowserCompatibilty() {
	System.out.println("Browser compatibilty");
}
private void checkBrowserRam() {
	System.out.println("Browser Ram");
}
}
