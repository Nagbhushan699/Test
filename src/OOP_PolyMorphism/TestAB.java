package OOP_PolyMorphism;

public class TestAB extends B {
	 @Override
		public void m1() {
	     System.out.println("M1----Bhushan");
		}
	public static void main(String[] args) {
		 TestAB ob=new TestAB();
         ob.m1();
         ob.m1(10);
         ob.m1(10,"Bhalerao");
	}

}
