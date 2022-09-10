package practise;

interface interfac_static_ {
	default void print()
	{
		System.out.println("I am a vehicle");
	}
	static void blowhorn()
	{
		System.out.println("blowing horn");
}
class car implements interfac_static_
{
	public void print()
	{
		interfac_static_.super.print();
		interfac_static_.blowhorn();
	}
}
	public static void main(String[] args) {
		interfac_static_ obj =new car();
	obj.print();

	}

}
