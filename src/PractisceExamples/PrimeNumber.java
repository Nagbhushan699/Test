package PractisceExamples;

public class PrimeNumber {

	public static void main(String[] args) {
		int no=10;
		int sum=0;
		for(int i=2;i<no-1;i++) {
			if(no%i==0) {
				sum++;
			}			
		}
		if(sum==0) {
			System.out.println(no+"  is a prime no");
		}
		else {
			System.out.println(no+" is not a prime no");
		}

	}

}
