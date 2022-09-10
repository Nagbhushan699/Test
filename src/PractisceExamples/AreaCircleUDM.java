package PractisceExamples;

public class AreaCircleUDM {
	static float pi=3.14f;
  public void CircumCircle(int radius) {
	  float result=2*pi*radius;
	  float area=pi*radius*radius;
	  System.out.println("Circumfernece of Circle "+result);
	  System.out.println("Area  of Circle "+area);
  }

	public static void main(String[] args) {
		AreaCircleUDM obj=new AreaCircleUDM();
		obj.CircumCircle(4);

	}

}
