package OOP_PolyMorphism;

public class Animal {
	public Animal() {
		System.out.println("Hi I am Animal");
	}
	void show() {
		System.out.println("Hi..");
	}
public static void main(String []args) {
	Dog obj=new Dog();
	obj.bark();
	obj.show();
	Cat obj1=new Cat();
	obj1.meww();
	obj.show();
}
}
