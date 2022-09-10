package PractisceExamples;

public class BuilderPattern {
	public BuilderPattern m1(String s) {
		System.out.println("My name is "+s);
		return this;
	}
	public BuilderPattern m2(int s) {
		System.out.println("My age is "+s);
		return this;
	}
	public BuilderPattern m3(double s) {
		System.out.println("My salary is "+s);
		return this;
	}

	public static void main(String[] args) {
		BuilderPattern obj=new BuilderPattern();
		obj.m1("Bhushan").m2(20).m3(20.366);

	}

}
