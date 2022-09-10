package Harikrishna_Programs;

public class StaticUDV_UDM {
	 int a=0;
	static void add() {
		System.out.println("Hello : ");
	}

	public static void main(String[] args) {
		/**Develop a program to declare udv and udm inside a class provide memory to them by using static keyword
		 * and access them and execute them from main method
		 */
		StaticUDV_UDM obj=new StaticUDV_UDM();
		System.out.println(obj.a);
		add();
	}

}
