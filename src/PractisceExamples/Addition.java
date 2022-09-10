package PractisceExamples;

public class Addition {
	public int add(int a,int b) throws IllegalArgumentException {
		if(a<0 || b<0) {
			throw new IllegalArgumentException ("Please pass postiive value");
	    }
		else {
			int c=a+b;
			return c;
		}
	}

	public static void main(String[] args) {
     Addition obj=new Addition();
     try {
    	int d= obj.add(0,-1);
    	System.out.println("Sum : "+d);
     }
     catch(IllegalArgumentException e) {
    	 System.out.println("Error : "+e.getMessage());
     }

	}

}
