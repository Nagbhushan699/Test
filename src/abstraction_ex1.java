
public abstract class abstraction_ex1 {
int a=10;
abstract public void show();
public void disp() {
	System.out.println(" "+a);
	System.out.println("my name is bhushan");
}
}
class bhau extends abstraction_ex1{
	public void show() {
		System.out.println("my name is bhalerao");
	}

	public static void main(String[] args) {
		bhau obj=new bhau();
		obj.disp();
		obj.show();
		

	}

}
