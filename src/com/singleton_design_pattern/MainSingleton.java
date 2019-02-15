package com.singleton_design_pattern;


class Singleton {
	private Singleton() {}
	public static Singleton single;
	public static synchronized Singleton getSingleton() {
		if (single == null) {		
			single = new Singleton();
		}
		return single;
	}
}

public class MainSingleton {

	public static void main(String[] args) {
		
		// Apply multi-threading here
		//Thread t=new Thread();	
		
		// Singleton single1=new Singleton();
		Singleton.getSingleton();
		System.out.println(Singleton.getSingleton());
		
		// call getSingleton method 2nd time
		Singleton.getSingleton();
		System.out.println(Singleton.getSingleton());
		
		System.out.println("If the hash values did not change, It means the only one object is created."
				+ " So it's a singleton class");
		
	}

}
