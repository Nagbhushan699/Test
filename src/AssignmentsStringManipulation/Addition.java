package AssignmentsStringManipulation;

public class Addition {
	int a;
	int b;
	int c;
	/**void add(int a,int b) {
	**int c=a+b;
		System.out.println(c);
	}*/
	void sum(Addition obj) {
	  System.out.println(obj.a);
	  System.out.println(obj.b);
	   
	}

	public static void main(String[] args) {
		Addition obj=new Addition();
		obj.a=10;
		obj.b=190;
		obj.sum(obj);

	}

}
