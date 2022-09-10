package Assignment_Inheritance;

public class ApoloHospital extends Medical implements US_Medical {
	@Override
	public void Remdesevir() {
		System.out.println("WHO-----Remdesevir");
	}
	@Override
	public void monekyPokshVaccine() {
		System.out.println("WHO-----monekyPokshVaccine");	
	}
	@Override
	public void covidVariant() {
		System.out.println("US_Medical-----covidVariant");
	}
	@Override
	public void deltaVariant() {
		System.out.println("US_Medical-----deltaVariant");
	}
	public void rabiesVaccine() {
		System.out.println("Apolo-----rabiesVaccine");
	}
	public void coviShield() {
		System.out.println("Apolo-----coviShield");
	}

}
