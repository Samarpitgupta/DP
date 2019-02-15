package com.builder_design_pattern1;

public class Laptop {

		private String RAM;
		private boolean touch_screen;
		private String HDD;
		
		Laptop(String RAM,String HDD, boolean touch_screen)
		{
			this.RAM=RAM;
			this.HDD=HDD;
			this.touch_screen=touch_screen;
		}
		
		public String getRam()
		{
			return this.RAM;
		}
		public void setRam(String RAM)
		{
			this.RAM=RAM;
		}
		
		public boolean getTouch_screen()
		{
			return this.touch_screen;
		}
		public void setTouch_screen()
		{
	//		this.touch_screen=touch_screen;
		}
		
		public String getHdd()
		{
			return this.HDD;
		}
		
		public void setHDD(String  hdd)
		{
		//	this.HDD=HDD;
		}

		@Override
		public String toString() {
			return "Laptop [RAM=" + RAM + ", touch_screen=" + touch_screen + ", HDD=" + HDD + "]";
		}
		
		
}
