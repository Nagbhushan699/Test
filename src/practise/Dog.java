package practise;

public class Dog {
	String breed;
	String size;
	String name;
	int age;
	 void show(String breed,String size,String name,int age) {
		this.breed=breed;
		this.size=size;
		this.name=name;
		this.age=age;
		System.out.println("breed : "+breed);
		System.out.println("size : "+size);
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		
	}
	

	public static void main(String[] args) {
		Dog dog1=new Dog();
		dog1.show("buildog", "Large", "Rani", 5);
		System.out.println("________________");
		Dog dog2=new Dog();
		dog2.show("buildo", "small", "Raju", 10);
	}

}
