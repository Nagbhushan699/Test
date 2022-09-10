package Harikrishna_Programs;

public class Exception {
 static int validateNum(int num) throws IllegalArgumentException,IllegalStateException {
	 if(num<0) {
		 throw new IllegalArgumentException("do not pass negative value");
	 }
	 if(num<10 ||num>20) {
		 throw new IllegalStateException("please pass value in between 10-20");
	 }
	 else {
		 return num;
	 }
}
}
