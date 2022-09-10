package Interface;

public class LotusHospital implements USMedical,UKMedical,IndianMedical {
	//USMedical methods
	public void gnyacology() {
		System.out.println("gynacology--USMedical");
	}
	public void orthopedics() {
		System.out.println("orthopedics--USMedical");
	}
	@Override
	public void EmergencyService() {
		System.out.println("EmergencyService--USMedical");
	}
	//UKMedical methods
	public void sexology() {
		System.out.println("sexology--UKMedical");
	}
	public void MedicalServices() {
		System.out.println("MedicalServices--UKMedical");
	}
	//IndianMedical methods
	public void neuroSurgery() {
		System.out.println("neuroSurgery--IndianMedical");
	}
	 public void casulty() {
		 System.out.println("casulty--IndianMedical");
	 }
	 @Override
	 public void getRefund() {
	 	System.out.println("LotusHospital ________GetRefund");
	 }
	 
	 public static void getTratment() {
			System.out.println("LotusHospital ________getTratment");
		}
	 
}
