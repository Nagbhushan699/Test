package Harikrishna_Programs;

public class DigitalStore {
	 Pendrive p1=new Pendrive();
       void display() {
    	   System.out.println("***Computer details*******");
    	 ElectronicDevices.setproductName("HP");
    		p1.setMfg_Company("Wipro");
    		p1.setPortable(true);
        	p1.setWarrenty(1);
        	p1.setServicesCentres("Hyd");
        	p1.setColour("Blue");
         System.out.println("***Pendrive details*******");
         p1.setPrice(5000);
         p1.setType("Sandisk");
         p1.setColour("Red");
         p1.setMemoryCapacity(8);
    	 System.out.println(p1);
    	System.out.println("\n Computer's bussiness methods ***");
    	p1.communication();
    	p1.education();
    	p1.entertainment();
    	p1.DataStorage();
    }
    
	public static void main(String[] args) {
		DigitalStore obj=new DigitalStore();
		obj.display();

	}

}
