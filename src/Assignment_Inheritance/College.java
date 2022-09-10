package Assignment_Inheritance;

public class College extends University implements US_Education,UK_Education,IND_Education{
	@Override
	public void bachelorOfJournalism() {
		System.out.println("UN-------bachelorOfJournalism");
	}
	@Override
	public void bachelorOfMassCommunication() {
		System.out.println("UN-------bachelorOfMassCommunication");
	}
	@Override
	public void liberalArts() {
		System.out.println("US-------liberalArts");
	}
	@Override
    public void Medicine() {
		System.out.println("US-------Medicine");
    }
	 @Override
	 public void Architecture() {
		 System.out.println("UK-------Architecture");
	 }
	 @Override
     public void MBA() {
    	 System.out.println("UK-------MBA");
     }
	  @Override
     public void BCA() {
    	 System.out.println("IND-------BCA");
     }
	  @Override
     public void BTech() {
    	 System.out.println("IND-------BTech");
     }
	
     public void Bcom(){
    	 System.out.println("College-------Bcom");
     }
     @Override
     public void mTech() {
  	   System.out.println("University -----Mtech");
     }
     @Override
     public void bioMedical() {
  	   System.out.println("University -----bioMedical");
     }

}
