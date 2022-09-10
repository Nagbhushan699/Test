package Assignments;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee  obj=new Employee();
		obj.setName("Harshal");
		obj.setAge(25);
		obj.setSalary(18000.35);
		obj.setBoolean(true);
		obj.setGender('M');
		obj.getEmployeeInfo(obj.getName(), obj.getAge(), obj.getSalary(),obj.getIsActive(),
				obj.getGender());


	}

}
