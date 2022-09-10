package ConsturctorProblems;

public class B3 extends A3 {
   static int a=30;
   static int b=20;
   int x=50;
   int y=60;
   void  m1() {
	   System.out.println(this.a+" "+super.a);//30 10
	   System.out.println(this.x+" "+super.x); //50 20
	   System.out.println(this.b+" "+this.y); //20 60
   }
}
