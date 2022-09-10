package OOP_PolyMorphism;

public class Chemistry extends ScienceBranch {
	String sub2="Chemistry";
	public void learning() {
		System.out.println("Learning chemistry");
	}

	public static void main(String[] args) {
		Chemistry obj=new Chemistry();
		System.out.println(obj.sub2);
		obj.learning();
		
		Biology obj1=new Biology();
		System.out.println(obj1.sub);
		obj1.learning();


	}

}
