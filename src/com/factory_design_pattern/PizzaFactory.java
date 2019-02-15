package com.factory_design_pattern;

public class PizzaFactory {

	public static Pizza createPizza(String type) { 
		 Pizza p=null;
		 
		 if(type.equalsIgnoreCase("CHEESE"))
		 {
		  p=new CheesePizza();
		 }
		 else if(type.equalsIgnoreCase("CHICKEN"))
		 {
		  p=new ChickenPizza();
		 }
		 else if(type.equalsIgnoreCase("PaneerTikkaPizza"))
		 {
			 p=new PaneerTikkaPizza();
		 }
	
		 p.prepare();
			p.bake();
			p.cut();
			 return p;
		}	
}
