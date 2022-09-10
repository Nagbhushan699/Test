package Practise12;

public class switch1 {
	public void showLocation(String name) {
		switch(name) {
		case "bhushan":System.out.println("Hungunda");
		break;
		case "karan":System.out.println("Wasmat");
		break;
		case "Vaibhav":System.out.println("Balapur");
		break;
		case "Ram":System.out.println("Biloli");
		break;
		}
	}
	public void showDay(int date) {
		switch(date) {
		case 1:System.out.println("Sunday");
		break;
		case 2:System.out.println("Monday");
		break;
		case 3:System.out.println("TuesDay");
		break;
		case 4:System.out.println("Friday");
		break;
		}
	}
	public void showNum(int []p) {
		for(int i=0;i<p.length-1;i++) {
			if(p[i]==20) {
				continue;
			}
			System.out.println("p["+i+"] : "+p[i]);
		}
		
	}
 public static void main (String []args) {
	 switch1 obj=new switch1();
	 obj.showLocation("bhushan");
	 obj.showDay(2);
	 int i[]= {10,20,30,40,50};
	 obj.showNum(i);
 }
}
