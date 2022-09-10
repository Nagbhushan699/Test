package builderPattern;

public class Burger {
public Burger addBread() {
	System.out.println("Burger is made by toasting bread");
	return this;
}
public Burger addPatty() {
	System.out.println("Burger is made by creating");
	return this;
}
public Burger addSauces() {
	System.out.println("Burger is made by making sauces");
	return this;
}
public Burger ready() {
	System.out.println("Burger is ready to eat");
	return this;
}
}
