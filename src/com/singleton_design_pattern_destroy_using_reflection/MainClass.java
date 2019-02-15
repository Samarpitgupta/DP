package com.singleton_design_pattern_destroy_using_reflection;

import java.lang.reflect.Constructor;

public class MainClass {

	public static void main(String args[])
	{
		Singleton instance1=Singleton.instance1;
		Singleton instance2=null;
		
		try
		{
			Constructor[] constructors=Singleton.class.getDeclaredConstructors();
			for(Constructor constructor : constructors)
			{
				constructor.setAccessible(true);
				instance2=(Singleton) constructor.newInstance();
				break;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("First Instance's Hash Code: "+instance1.hashCode());
		System.out.println("Second Instance's Hash Code: "+instance2.hashCode());
		System.out.println("if they have different hash values, It's mean, "
				+ "we have got two objects of Singleton class.");
	}
	
}
