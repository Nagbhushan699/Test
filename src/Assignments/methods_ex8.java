package Assignments;
//WAP which will ask the user to enter his marks(out of 100).define a method that
// will display grades according to the marks entered as below
public class methods_ex8 {
	int marks;
	int ch;
	void show(int marks)
	{
		this.marks=marks;
	    if(marks>90 && marks<=100)
	    {
	    	System.out.println("Grade: AA");
	    }
	    else if(marks>80 && marks<=90)
	    {
	    	System.out.println("Grade: AB");
	    }
	    else if(marks>70 && marks<=80)
	    {
	    	System.out.println("Grade: BB");
	    }
	    else if(marks>60 && marks<=70)
	    {
	    	System.out.println("Grade: BC");
	    }
	    else if(marks>50 && marks<=60)
	    {
	    	System.out.println("Grade: CD");
	    }
	    else if(marks>40 && marks<=50)
	    {
	    	System.out.println("Grade: AB");
	    }
	    else
	    {
	    	System.out.println("FAIL");
	    }
	}

	public static void main(String[] args) {
		methods_ex8  obj=new methods_ex8 ();
		obj.show(45);

	}

}
