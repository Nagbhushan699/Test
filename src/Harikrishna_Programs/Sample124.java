package Harikrishna_Programs;

import OOP_PolyMorphism.override;

public class Sample124 extends sample122 {
public void Sample122() {
  super.m1();
  System.out.println(super.a);
}
	public static void main(String[] args) {
	System.out.println("Sample124");
	Sample124 file=new Sample124();
	file.Sample122();
	}

}
