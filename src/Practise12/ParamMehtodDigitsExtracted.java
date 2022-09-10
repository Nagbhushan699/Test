package Practise12;

public class ParamMehtodDigitsExtracted {
	String s;
public void m1(String s) {
	this.s=s;
	for(int i=0;i<s.length()-1;i++) {
		s.charAt(i);
	}
	System.out.println("Numbers : "+s);
}
	public static void main(String[] args) {
		ParamMehtodDigitsExtracted obj=new ParamMehtodDigitsExtracted();
		String s1="7066355442";
		obj.m1(s1);
		
		

	}

}
