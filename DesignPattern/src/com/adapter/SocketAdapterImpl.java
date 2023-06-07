package com.adapter;

public class SocketAdapterImpl extends Socket implements SocketAdapter{

	@Override
	public Volt get220Volt() {
		Volt volt = getVolt();
		return volt;
	}

	@Override
	public Volt get22Volt() {
		Volt volt = getVolt();
		return convertVolt(volt,10);
	}

	@Override
	public Volt get11Volt() {
		Volt volt = getVolt();
		return convertVolt(volt,20);
	}

	@Override
	public Volt get55Volt() {
		Volt volt = getVolt();
		return convertVolt(volt,4);
	}
	private Volt convertVolt(	Volt v,int denominator) {
		return new Volt(v.getVoltage()/denominator);
		
	}

}
