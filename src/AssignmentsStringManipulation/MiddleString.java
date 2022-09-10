package AssignmentsStringManipulation;

import java.util.Scanner;

public class MiddleString {

	public static void main(String[] args) {
		// Assume that a string consists of 3 words ,print out the middle one
		String s="I am learning java tdit";
		System.out.println(s.substring(2, 4));
		System.out.println(s.substring(s.length()-9,s.length()-5));
		System.out.println(s.substring(s.length()/2+3));
		System.out.println(s.substring(s.length()/2-6,s.length()/2+2));

	}

}
