package PractisceExamples;

public class Bicycle {
	
   public void breaking(int gears) {
	   System.out.println("Bicycle having "+gears+" gears");
   }
	public static void main(String[] args) {
		Bicycle obj=new Bicycle();
		obj.breaking(5);
		Bicycle obj1=new Bicycle();
		obj.breaking(6);
		Bicycle obj2=new Bicycle();
		obj.breaking(7);
	}

}
