package practise;

public class ObjectArray {
int a; 
String b;
void display() {
	System.out.println(a);
	System.out.println(b);
}

	public static void main(String[] args) {
     ObjectArray []e=new ObjectArray[3];
     for(int i=0;i<e.length-1;i++) {
    	 e[i]=new ObjectArray();
    	 e[i].a=20;
    	 e[i].b="bhushan";
    	 e[i].display();
     }
     

	}

}
