package PractisceExamples;

public class ReriveInteger {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
        int c=200;
        boolean flag=false;
        for(int e:a) {
        	if(e==c) {
        		flag=true;
        	}
        }
        if(flag) {
        	System.out.println("C is found");
        }
        else {
        	System.out.println("C is not found");
        }
	
	
	
	
	}

}
