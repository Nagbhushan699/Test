package practise;

public class ArrayReturn {
	String colors []= {"Black","Blue","Yellow","Green"};
	public String[] show() {
		for(int i=0;i<colors.length;i++)
		{
			System.out.println(colors[i]);
		}
		return colors;
	}

	public static void main(String[] args) {
		ArrayReturn obj=new ArrayReturn();
		String re[]=obj.show();

	}

}
