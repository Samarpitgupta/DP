package com.builder_design_pattern1;

public class Computer {

	private String HDD;
	private String RAM;
	
	private boolean isGraphicCardEnabled;
	private boolean isBluetoothEnabled;
	
	public String getHDD() {
		return HDD;
	}
	public String getRAM() {
		return RAM;
	}
	public boolean isGraphicCardEnabled() {
		return isGraphicCardEnabled;
	}
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	//private constructor
	private Computer(ComputerBuilder computerBuilder) {
	
		this.HDD=computerBuilder.HDD;
		this.RAM=computerBuilder.RAM;
		this.isGraphicCardEnabled=computerBuilder.isGraphicCardEnabled;
		this.isBluetoothEnabled=computerBuilder.isBluetoothEnabled;
	}


	@Override
	public String toString() {
		return "Computer Configurations \n[  HDD=" + HDD + ",\n RAM=" + RAM + ",\n isGraphicCardEnabled=" + isGraphicCardEnabled + ",\n isBluetoothEnabled=" + isBluetoothEnabled + ",\n getHDD()=" + getHDD() + ",\n getRAM()=" + getRAM()
				+ ",\n isGraphicCardEnabled()=" + isGraphicCardEnabled() + ",\n isBluetoothEnabled()="
				+ isBluetoothEnabled()+" ]" ;
	}


	public static class ComputerBuilder
	{
		private String HDD;
		private String RAM;
		private boolean isGraphicCardEnabled;
		private boolean isBluetoothEnabled;
		
		public ComputerBuilder(String hDD, String rAM) {
			super();
			HDD = hDD;
			RAM = rAM;
		}
		
		public ComputerBuilder setGraphicCardEnabled(boolean isGraphicCardEnabled)
		{
			this.isGraphicCardEnabled=isGraphicCardEnabled;
			return this;
		}
		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled)
		{
			this.isBluetoothEnabled=isBluetoothEnabled;
			return this;
		}
			
		public Computer build()
		{
			return new Computer(this);
		}
	}
	
}
