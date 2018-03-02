package com.abouzidi.gof;

public class Mobile implements Connection {

	private Connection connection;

	public void sendData(byte[] data) {
		if (connection == null) {
			connection = new WifiConnection();
		}
		connection.sendData(data);
	}

	public byte[] receiveData() {

		if (connection == null) {
			connection = new WifiConnection();
		}
		return connection.receiveData();
	}

}
