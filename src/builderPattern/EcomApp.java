package builderPattern;

public class EcomApp {
 public EcomApp login() {
	 System.out.println("Login....");
	 return this;
 }
 public EcomApp login(String UN,int pass) {
	 System.out.println("Login with "+UN+" "+pass);
	 return this;
 }
 public EcomApp search(String productName){
	 System.out.println("Search with product name"+productName);
	 return this;
 }
 public EcomApp search(String productName,int Price){
 System.out.println("Search with product name & Price  "+productName+" "+Price);
 return this;
 }
 
}
