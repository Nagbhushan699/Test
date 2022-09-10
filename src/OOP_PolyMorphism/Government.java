package OOP_PolyMorphism;

public class Government {

	public static void main(String[] args) {
		SBI obj=new SBI();
		Double res=obj.getInterestRate();
		System.out.println("SBI Returns : "+res+"\sinterest rate");
		obj.location();
		
		RBI ob=new RBI();
		Double re1=ob.getInterestRate();
		System.out.println("RBI Returns : "+re1+"\sinterest rate");
      
		ICICI obj1=new ICICI();
		Double re2=obj1.getInterestRate();
		System.out.println("ICICI Returns : "+re2+"\sinterest rate");
      
	}

}
