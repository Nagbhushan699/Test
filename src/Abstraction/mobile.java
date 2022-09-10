package Abstraction;

public abstract class mobile {
	int ram;
	String modelname;
	int battery;
	public void showInfo() {
		ram=8;
		modelname="vivos1";
		battery=1500;
		System.out.println("Mobile ram "+ram+"GB");
		System.out.println("Mobile modelname "+ram);
		System.out.println("Mobile battery "+battery+ "mah");
	}
	public void Fingerprint() {
		System.out.println("Fingerprint on middle of screen");
	}
	public abstract void camera();
	public abstract void call();
	public abstract void watchVideo();
	

}
