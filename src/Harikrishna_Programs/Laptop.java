package Harikrishna_Programs;

public class Laptop {
   String name;
   static String graphicsCard;
   static int size;
   int ram;
   int hardDisk;
   public static void showConfiguration() {
	   graphicsCard="intel 4gb";
	   size=15;
	   System.out.println("Graphics card : "+ graphicsCard);
	   System.out.println("size : "+ size);
   }
   public void getLaptopInfo(String name,int ram,int hardDisk) {
	   this.name=name;
	   this.ram=ram;
	   this.hardDisk=hardDisk;
	   System.out.println(" Laptop name : "+name);
	   System.out.println(" Laptop ram : "+ram +"GB");
	   System.out.println(" Laptop hardDisk : "+hardDisk+" TB");
   }
}
