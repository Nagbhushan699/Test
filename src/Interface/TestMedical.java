package Interface;

public class TestMedical {

	public static void main(String[] args) {
		LotusHospital obj=new LotusHospital();
		obj.sexology();
		obj.EmergencyService();
		obj.gnyacology();
		obj.MedicalServices();
		obj.neuroSurgery();
		obj.orthopedics();
		obj.casulty();
		System.out.println(USMedical.a);
		obj.getRefund();
		USMedical.getTratment();
		LotusHospital.getTratment();
		System.out.println("-----------------------");
		//topcasting
		USMedical ob=new LotusHospital();
		ob.EmergencyService();
	

	}

}
