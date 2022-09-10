package Assignments;

public class SwitchCaseex1 {
	public void show(int marks) {
		switch(marks)
		{
		case 90	
		
		: System.out.println("AA");
		break;
		case 81: System.out.println("BB");
		break;
		case 71: System.out.println("CC");
		break;
		case 61: System.out.println("DD");
		break;
		default : System.out.println("FF");
		break;
		}
	}

	public static void main(String[] args) {
		SwitchCaseex1 obj=new SwitchCaseex1();
		obj.show(50);

	}

}
