package com.mvc_design_pattern;

public class MVCTestMain {

	public static Employee retrieveEmployeeInformationFromDatabase()
	{
		Employee emp1=new Employee();
		emp1.setEmp_id(101);
		emp1.setEmp_name("Samarpit");
		return emp1;
	}
	
	public static void main(String args[])
	{
		Employee model=retrieveEmployeeInformationFromDatabase();
		EmployeeView view=new EmployeeView();
		EmployeeController controller=new EmployeeController(model,view);
		controller.updateView();
		System.out.println();
		System.out.println("After update Employee Name: ");
		System.out.println();
		controller.setEmployeeName("Samarpit Gupta");
		controller.updateView();
	
	}
	
}
