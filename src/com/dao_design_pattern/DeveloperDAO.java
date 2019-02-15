package com.dao_design_pattern;

import java.util.List;

public interface DeveloperDAO
{
	public List<Developer> getAllDeveloper();
	public Developer getDeveloper(int id);
	public void updateDeveloper(Developer dev);
	public void deleteDeveloper(Developer dev );
}

