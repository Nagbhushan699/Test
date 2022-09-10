package OOP_PolyMorphism;

public class Science extends Faculty {
	double salary=60000;
	

	public static void main(String[] args) {
		Science obj=new Science();
		System.out.println("Salary : "+obj.salary);
		System.out.println("Bonus : "+obj.bonus);
		obj.getSalary();

	}

}
