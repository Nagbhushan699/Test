package AssignmentsStringManipulation;

import java.util.Arrays;

public class HalfString {

	public static void main(String[] args) {
		//WAP that gives you last half of the string
		String s="I am Learning Java in TDIT Solutions";
		System.out.println(s.substring(s.length()/2));
		String[]arr=s.split(" ");
		
//		for(String e:arr) {
//			System.out.println(e);
//		}
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));

	}

}
