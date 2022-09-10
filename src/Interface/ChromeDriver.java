package Interface;

public abstract class ChromeDriver implements WebDriver {
	 public void findElement() {
		 System.out.println("FindElements------ChromeDriver");
	 }
	 public void findViruses() {
		 System.out.println("FindViruses------ChromeDriver");
	 }
	 public void clickElements() {
		 System.out.println("ClickElements------ChromeDriver");
		}
		public  abstract void title();
//		public void getUrl() {
//			System.out.println("GetUrl------ChromeDriver");
//		}
}
