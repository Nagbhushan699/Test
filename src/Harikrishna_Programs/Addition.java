package Harikrishna_Programs;

public class Addition {
static int add(int a)throws IllegalArgumentException,IllegalStateException {
	if(a<0) {
		throw new IllegalArgumentException("do not pass negative number");
	}
	 if(a<10 || a>20) {
		throw new IllegalStateException("number must be in between 10 & 20 ");
	}
		return a+30;
	
}
}
