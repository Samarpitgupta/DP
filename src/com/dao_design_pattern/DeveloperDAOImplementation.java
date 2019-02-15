package com.dao_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class DeveloperDAOImplementation implements DeveloperDAO {

	
	List<Developer> devList;
	
	public DeveloperDAOImplementation() {
		devList= new ArrayList<Developer>();
		Developer d1=new Developer(1,"Samarpit");
		Developer d2=new Developer(2,"Likhit");
		devList.add(d1);
		devList.add(d2);
	}

	@Override
	public List<Developer> getAllDeveloper() {
				return devList;
	}

	@Override
	public Developer getDeveloper(int id) {
		return devList.get(id);
	}

	@Override
	public void updateDeveloper(Developer dev) {
		devList.get(dev.getId()).setName(dev.getName());
		System.out.println("developer information updated successfully");
	}

	@Override
	public void deleteDeveloper(Developer dev) {
		devList.remove(dev.getId());
		System.out.println("Developer id"+dev.getId()+" delete from the developer list");
	}
	
}
