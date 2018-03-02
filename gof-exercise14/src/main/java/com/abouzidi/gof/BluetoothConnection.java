package com.abouzidi.gof;

import java.util.logging.Logger;

public class BluetoothConnection extends Connection {

	private final Logger LOG = Logger.getLogger(BluetoothConnection.class.getName());

	@Override
	public void connect() {
		LOG.info("bluetooth connection");
	}

}
