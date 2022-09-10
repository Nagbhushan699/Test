package Interview_Programs;
//Can we call constructor from another constructor if yes then how?
//yes we can call by using this()but another constuctor must be overloaded
public class Consturctor {
 protected Consturctor(){
		this(10,20);
	}
Consturctor(int a,int b){
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Consturctor obj=new Consturctor();
		

	}

}
