package com.adapter_design_pattern1;

public class SocketClassAdapterImplementation extends Socket implements SocketAdapter{

	private Volt convertVolt(Volt v, int i)
	{
		return new Volt(v.getVolts()/i);
	}
	@Override
	public Volt get120Volts() {
		return getVolts();
	}

	@Override
	public Volt get12Volts() {
		Volt v=getVolts();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volts() {
		Volt v=getVolts();
		return convertVolt(v, 40);
	}
}
