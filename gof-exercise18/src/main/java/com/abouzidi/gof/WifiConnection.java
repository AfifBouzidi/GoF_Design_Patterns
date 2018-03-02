package com.abouzidi.gof;

import java.util.logging.Logger;

public class WifiConnection implements Connection {

	private final Logger LOG = Logger.getLogger(WifiConnection.class.getName());

	public void sendData(byte[] data) {
		LOG.info("data sent via wifi");
	}

	public byte[] receiveData() {
		LOG.info("data received via wifi");
		return new byte[10];
	}

}
