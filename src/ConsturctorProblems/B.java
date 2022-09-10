package ConsturctorProblems;

public class B extends A{
	static int h;
	String name;
	{
		System.out.println(h=50);
		System.out.println(name="Karan");
	}
  B(){
	  super(10);
	  System.out.println("Hi");
	 
  }
  void display() {
	  System.out.println("How are you");
  }
}
