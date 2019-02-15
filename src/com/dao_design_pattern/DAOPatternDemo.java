package com.dao_design_pattern;

public class DAOPatternDemo {

	public static void main(String args[])
	{
		DeveloperDAO dDAO=new DeveloperDAOImplementation();	
		System.out.println("List of All Developers in LIST");
		for(Developer dev: dDAO.getAllDeveloper())
		{
			System.out.println("Developer ID "+dev.getId()+" Developer Name: "+dev.getName());
		}
		
		Developer d=dDAO.getAllDeveloper().get(0);
		d.setName("Samarpit Gupta");
		dDAO.updateDeveloper(d);
		System.out.println();
		System.out.println("After updation Developer information: ");
		System.out.println(d.getId()+"  "+d.getName());
		
	}
}
