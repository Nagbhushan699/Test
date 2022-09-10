package Assignments;
//A person is eligible to vote if his/her age is greater than or equal to 18
//define a method to find out if he/she is eligible to vote
public class methods_ex6 {
int age;
void disp(int age)
{
	this.age=age;
	if(age>=18)
	{
		System.out.println("you are eligible to vote");
	}
	else
	{
		System.out.println("you are not eligible to vote");
	}
}
	public static void main(String[] args) {
		methods_ex6 obj=new methods_ex6();
		obj.disp(19);

	}

}
