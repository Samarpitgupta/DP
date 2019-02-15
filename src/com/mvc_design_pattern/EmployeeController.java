package com.mvc_design_pattern;

public class EmployeeController {

	private Employee model;
	private EmployeeView view;
	
	public EmployeeController(Employee model, EmployeeView view)
	{
		this.model=model;
		this.view=view;
	}

	public void setEmployeeName(String name)
	{
		model.setEmp_name(name);
	}
	
	public String getEmployeeName()
	{
		return model.getEmp_name();
	}
	
	public void setEmployeeID(int id)
	{
		model.setEmp_id(id);
	}
	public int getEmployeeID()
	{
		return model.getEmp_id();
	}
	public void updateView()
	{
		view.printEmployeeDetails( model.getEmp_id(),model.getEmp_name());
	}
	
}
