package Harikrishna_Programs;

import java.io.IOException;

public class AdditionNum {
	int a,b;
	static int add(int a,int b)throws IOException {
		if(a<0 || b<0) {
			throw new IllegalArgumentException("do not pass -ve values");
		}
		else {
			return a+b;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			int c=AdditionNum.add(100,-20);
			System.out.println(c);
		}
		catch(IllegalArgumentException e) {
			System.out.println("error.. : "+e.getMessage());
		}

	}

}
