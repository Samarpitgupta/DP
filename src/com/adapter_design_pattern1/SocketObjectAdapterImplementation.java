package com.adapter_design_pattern1;

public class SocketObjectAdapterImplementation implements SocketAdapter
{
	
// Using composition for Adapter DP
	public Socket socket=new Socket();
	
	private Volt convertVolt(Volt v,int i)
	{
		return new Volt(v.getVolts()/i);
	}
		
	@Override
	public Volt get120Volts() {
		
		return socket.getVolts();
	}

	@Override
	public Volt get12Volts() {

		Volt v=socket.getVolts();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volts() {
		Volt v=socket.getVolts();
		return convertVolt(v,40 );
	}

}
