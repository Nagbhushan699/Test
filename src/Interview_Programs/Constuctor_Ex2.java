package Interview_Programs;

public class Constuctor_Ex2 {
//	Consturctor obj=new Consturctor();
	public static void main(String[] args) {
		int a[][]=new int[4][3];
		for(int i=0;i<a.length-1;i++) {
			{
				for(int j=0;j<a.length-1;j++) {
					a[i][j]=10;
					a[i][j]=20;
				}
			}
			for (int j = 0; j < a.length-1; j++) {
				for (int j2 = 0; j2 < a.length-1; j2++) {
					System.out.println(a[i][j]);
				}
			}
	}
	public static void main(){
		
	}
		
	}
}
