package Interface;

public interface USMedical {
	int a=20;
	void gnyacology();
	void orthopedics();
	void EmergencyService();
	public static void getTratment() {
		System.out.println("USMedical ________getTratment");
	}
	default void getRefund() {
		System.out.println("USMedical ________GetRefund");
	}
	

}
