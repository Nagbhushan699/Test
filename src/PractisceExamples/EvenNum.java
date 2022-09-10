package PractisceExamples;

public class EvenNum {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		int no=20;
		for(int i=2;i<no-1;i++) {
			int sum=0;
			if(i%no-1==0) {
				sum=sum+1;
			}
			if(sum<0) {
				System.out.println(i+"It's not a prime no");
			}
			else {
				System.out.println(i+"is a prime no");
			}
		}

	}

}
