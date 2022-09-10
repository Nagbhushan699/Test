package PractisceExamples;

public class MethodReturn {
public String[] add(String s[]) {
	return s;
	
}
	public static void main(String[] args) {
		MethodReturn obj=new MethodReturn();
		String e[]=obj.add(new String[]{"Bhushan ","Bhalerao"});
	  for(String s:e){
		  System.out.println(s);
	  }
	}
}
