package Harikrishna_Programs;

import java.util.Scanner;

public class BajajElectronics {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
		System.out.println("How many washingMaschine details you want : ");
		int noOfMaschines=scn.nextInt();
	 WashingMaschine w1[]=new WashingMaschine [noOfMaschines];
	 for(int i=0;i<noOfMaschines;i++) {
		 w1[i]=new WashingMaschine();
     System.out.println("Enter WashingMaschine Name : ");
    w1[i] .setWashingMaschineName(scn.next());
     System.out.println("Enter WashingMaschine Model No : ");
     w1[i].setModelNo(scn.nextInt());
     System.out.println("Is WashingMaschine automatic : ");
     w1[i].setAutomatic(scn.nextBoolean());
     System.out.println("Enter  WashingMaschine CapacityInkj: ");
     w1[i].setCapacityInkj(scn.nextDouble());
     System.out.println("Enter  WashingMaschine LoadType: ");
     w1[i].setLoadType(scn.next());
	 }
  for(int i=0;i<w1.length;i++) {
	  w1[i].display();
  }
	}

}
