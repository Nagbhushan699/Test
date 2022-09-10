package Practise12;

public class DigitsExtracted {
public void	m1(){
		String s="1234567";
		for(int i=0;i<s.length()-1;i++) {
		s.charAt(i);
		}
		System.out.println("Numbers : "+s);
	}

	public static void main(String[] args) {
		DigitsExtracted obj=new DigitsExtracted();
		obj.m1();

	}

}
