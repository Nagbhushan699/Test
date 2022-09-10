package bhalerao;

public class datatype_ex {

	public static void main(String[] args) {
        byte s=127; //range :-128 to 127  size: 1 byte
        Short r=32767;  //range: -32767 to 32767  size: 2 byte
        System.out.println(s);
        System.out.println(r);
        int a=45000;
        System.out.println(a);
        float f=20.00f;   //range : upto 7 decimal place size: 4 byte;
        float y=(float)35.00;
        System.out.println((float)32.00);
        System.out.println(y);
        double t=10.55;
        System.out.println(t);
        char tr='r';   //a-z : ascii values range  97 to 122
        char rr='t';   //A-Z : ascii values range 65 to 90
        char er='9';   //0-9 : ascii values 48 to 57
        System.out.println(tr+rr+er);   //287
        System.out.println(er);  //9
        
	}

}
