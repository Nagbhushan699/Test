package PractisceExamples;

public class StringArrayPass {
	public void showArray(String[]s,String e) {
		for(int i=0;i<s.length;i++) {
			if(s[i].contains(e)) {
				System.out.println(s[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		StringArrayPass obj=new StringArrayPass();
		String w[]= {"chrome","opera","edge","UC"};
		obj.showArray(w, "edge");

	}

}
