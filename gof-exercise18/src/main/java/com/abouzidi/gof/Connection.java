package com.abouzidi.gof;

public interface Connection {
	
	public void sendData(byte[] data);
	
	public byte[] receiveData();

}
