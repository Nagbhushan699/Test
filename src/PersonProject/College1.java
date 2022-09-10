package PersonProject;

public class College1 {

	public static void main(String[] args) {
		Person1 p1=new Person1("Bhushan",5.5,20);
		Student1 obj=new Student1("Bhushan",5.5,20,"Selenium",50000);
		System.out.println();
		System.out.println(p1);
		System.out.println();
		p1.eating();
		obj.eating();
		System.out.println();
		p1.sleeping();
		obj.sleeping();
		System.out.println();
		obj.reading();
		obj.writing();

	}

}
