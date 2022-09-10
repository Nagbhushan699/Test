package Harikrishna_Programs;

public class WashingMaschine {
	private String washingMaschineName;
	private int modelNo;
	private boolean automatic;
	private double capacityInkj;
	private String loadType;
	public void setWashingMaschineName(String washingMaschineName) {
		this.washingMaschineName=washingMaschineName;
	}
	public String getWashingMaschineName() {
		return washingMaschineName;
	}
	public void setModelNo(int modelNo) {
		this.modelNo=modelNo;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setAutomatic(boolean automatic) {
		this.automatic=automatic;
	}
	public boolean isAutomatic() {
		return automatic;
	}
public void setCapacityInkj(double capacityInkj) {
	this.capacityInkj=capacityInkj;
}
public double getCapacityInkj() {
	return capacityInkj;
}
public void setLoadType(String loadType) {
	this.loadType=loadType;
}
public String getLoadType() {
	return loadType;
}
public void display() {
	System.out.println("Washing maschine Name : "+washingMaschineName);
	System.out.println("Model No              : "+modelNo);
	System.out.println("Automatic             : "+automatic);
	System.out.println("CapacityInkj          : "+capacityInkj);
	System.out.println(" Load Type            : "+loadType);
}
}
