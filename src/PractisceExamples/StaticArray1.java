package PractisceExamples;

public class StaticArray1 {
  int a[];
  int b[];
  String name;
  int age;
  public StaticArray1(int a[]) {
	  this.a=a;
	  for(int r:a) {
		  System.out.println(r);
	  }
  }
  public int[] m1(int b[]) {
	  this.b=b;
	  return b;
  }
  public void get(StaticArray1 t) {
	  System.out.println(t.age);
	  System.out.println(t.name);
  }
	public static void main(String[] args) {
		int b[]= {10,20,30,40};
		StaticArray1 obj=new StaticArray1(b);
		StaticArray1 obj1=new StaticArray1(new int[] {85,3,6,9,10});
       int c[]=obj.m1(b);
       for(int e:c) {
    	   System.out.println(e);
       }
       obj.name="Bhushan";
       obj.age=2;
       obj.get(obj);
	}

}
