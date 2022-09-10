package PractisceExamples;

public class PyramidPattern {
      
	public static void main(String[] args) {
//	for(int i=1;i<=6;i++) {
//		for(int j=6;j>=1;j--) {
//			if(j>i) {
//				System.out.print(" ");
//			}
//			else {
//				System.out.print(" *");
//			}
//		}
//		System.out.println();
//	}
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
        for(int i=1;i<=5;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print(j+" ");
        	}
        	System.out.println();
        }
        	
	
	}
	}
	



