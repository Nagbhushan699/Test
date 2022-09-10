package Practise12;

public class TestA7 {

	public static void main(String[] args) {
		B7 ob=new B7();
		A7 obj=new B7();
		System.out.println(ob.x+" "+ob.y+" "+ob.z);
		System.out.println(obj.x+" "+obj.y+" "+obj.z);
		ob.x=5;
		obj.y=40;
		System.out.println(ob.x+" "+ob.y+" "+ob.z); //
		System.out.println(obj.x+" "+obj.y+" "+obj.z);
	}

}
